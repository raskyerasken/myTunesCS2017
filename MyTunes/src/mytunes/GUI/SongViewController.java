/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytunes.GUI;

import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.NotSupportedException;
import com.mpatric.mp3agic.UnsupportedTagException;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;
import mytunes.BE.TrackUtility;
import mytunes.BE.myTunes;

/**
 * FXML Controller class
 *
 * @author Kentg
 */
public class SongViewController implements Initializable {

    @FXML
    private TextField textTitle;
    @FXML
    private TextField textArtist;
    @FXML
    private TextField textFile;
    @FXML
    private TextField textAlbum;
    @FXML
    private TextField textYear;
    @FXML
    private Button chooseDirectory;

    private Stage dialogStage;
    private myTunes trackList;
    private boolean okClicked = false;
    
    
    myTunesModel model = new myTunesModel();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void save(ActionEvent event) {
        myTunes allSongs = new myTunes();
        allSongs.setSongName(textTitle.getText());
        allSongs.setArtist(textArtist.getText());
        allSongs.setAlbum(textAlbum.getText());

        int year = Integer.parseInt(textYear.getText());
        allSongs.setYear(year);
        
        
    }

    @FXML
    private void chooseDirectory(ActionEvent event) throws UnsupportedTagException, InvalidDataException, IOException, NotSupportedException {
         TrackUtility  choser= new TrackUtility();
        System.out.println(  choser.getdata());
      /* String[] songData = choser.getdata();
        System.out.println(songData);
        textTitle.setText(songData[1]);
        textArtist.setText(songData[0]);
        textAlbum.setText(songData[2]);
        textYear.setText(songData[3]);*/
        
        
    }
    }

    
  

