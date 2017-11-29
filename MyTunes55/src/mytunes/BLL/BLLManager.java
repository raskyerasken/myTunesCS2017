/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytunes.BLL;

import java.sql.SQLException;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.media.MediaPlayer;
import mytunes.BE.myTunes;
import mytunes.DAL.myTunesDAL;
import mytunes.GUI.AddSongController;
import static sun.audio.AudioPlayer.player;

/**
 *
 * @author mr.Andersen
 */
public class BLLManager 
{
    myTunesDAL mtdal = new myTunesDAL();
    
    
    public List<AddSongController> getAllSongs(String songName, String Artist, String Album, int Year){
        return mtdal.getAllSongs(songName, Artist, Album, 0);
    }
   
    public List<AddSongController> getAllSongsByPlaylist(String songName, String Artist, String Album, int Year)
    {
        return mtdal.getAllSongsByPlaylist(songName, Artist, Album, 0);
    }
    
//    public void remove (myTunes selectedSong) {
//        mtdal.remove(selectedSong);
//    }
    
    public void add(myTunes allSongs) throws SQLException
    {
        mtdal.add(allSongs);
    }
}

