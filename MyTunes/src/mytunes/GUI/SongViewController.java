/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytunes.GUI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
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

    
}
