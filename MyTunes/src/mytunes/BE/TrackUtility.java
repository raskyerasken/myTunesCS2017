/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytunes.BE;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.MapChangeListener;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.media.Media;

/**
 *
 * @author kasper
 */
public class TrackUtility {
    
    public static final List<String> SUPPORTED_FILE_EXTENSIONS = Arrays.asList(".mp3");
    
    /**
     * Get all tracklists stored in user preferences
     *
     * @param trackList
     * @param trackTable
     * @return List
     */
    public static ObservableList<myTunes> getAll(myTunes trackList, TableView trackTable) {
        
        ObservableList<myTunes> tracks = FXCollections.observableArrayList();
        
        File dir = new File(trackList.getPath().getValue());
        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("Cannot find audio source directory: " + dir + " please supply a directory as a command line argument");
        }
        
        for (String file : dir.list((File dir1, String name) -> {
            for(String ext : SUPPORTED_FILE_EXTENSIONS) {
                if (name.endsWith(ext)) {
                    return true;
                }
            }
            return false;
        }))
        {
            String fileURL = dir + "\\" + file;
            String cleanURL = cleanURL(fileURL);
            String mediaURL = "file:///" + cleanURL;
            
            myTunes track = new myTunes();
            Media media = new Media(mediaURL);
            media.getMetadata().addListener((MapChangeListener.Change<? extends String,
                    ? extends Object> ch) -> {
                if (ch.wasAdded()) {
                    handleMetadata(ch.getKey(), ch.getValueAdded(), (myTunes) track);
                    if(track.getArtist() == null || track.getArtist().getValue().equals("")) {
                        track.setArtist(new String("Unknown"));
                    }
                    if(track.getAlbum() == null || track.getAlbum().getValue.equals("")) {
                        track.setAlbum(new String("Unknown"));
                    }
                   
                    if(track.getSongName() == null || track.getSongName().getValue().equals("")) {
                        track.setSongName(new String(track.getSongName().getValue().replace(".mp3", "")));
                    }
                    TrackUtil.refreshTable(trackTable);
                }
            });
            track.setMedia(media);
            track.setFileName(new SimpleStringProperty(file));
            track.setPath(new SimpleStringProperty(dir + "/" + file));
            tracks.add(track);
        }

        return tracks;
    }
    
    /**
     * Extract all metadata information
     * @param key
     * @param value
     * @param track
     */
    public static void handleMetadata(String key, Object value, myTunes track) {
        //System.out.println(key + " - (" + value.toString() + ")");
        if(key.equals("album")) {
            if(value.toString().equals("")) {
                track.setAlbum(new String("Unknown"));
            } else {
                track.setAlbum(new String(value.toString()));
            }
        } else if(key.equals("artist") || key.equals("album artist")) {
            if(value.toString().equals("")) {
                track.setArtist(new String("Unknown"));
            } else {
                track.setArtist(new String(value.toString()));
            }
        } else if(key.equals("SongName")) {
            if(value.toString().equals("")) {
                track.setSongName(new String(track.getSongName().replace(".mp3", "")));
            } else {
                track.setSongName(new String(value.toString()));
            }
        } 
       
    }
    
    /**
     * Refresh table columns util
     *
     * @param table
     */
    public static void refreshTable(TableView table) {
        for (int i = 0; i < table.getColumns().size(); i++) {
            TableColumn tableColumn = ((TableColumn) (table.getColumns().get(i)));
            if(tableColumn.isVisible()) {
                tableColumn.setVisible(false);
                tableColumn.setVisible(true);
            }
        }
    }
    
    /**
     * Clean characters of URL
     *
     * @param uri
     */
    private static String cleanURL(String url) {
        url = url.replace("\\", "/");
        url = url.replaceAll(" ", "%20");
        url = url.replace("[", "%5B");
        url = url.replace("]", "%5D");
        return url;
    }
    
}

