/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytunes.GUI;

import java.io.File;
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
    private void chooseDirectory(ActionEvent event) {
          if (isInputValid()) {
            DirectoryChooser chooser = new DirectoryChooser();
            chooser.setTitle("Select your Music");
            File selectedDirectory = chooser.showDialog(dialogStage);
            trackList.setPath(new SimpleStringProperty(selectedDirectory.toString()));
            okClicked = true;
            dialogStage.close();
    }
    }

    private boolean isInputValid() {
        String errorMessage = "";
        
        if (errorMessage.length() == 0) {
            return true;
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Missing input");
            alert.setHeaderText(null);
            alert.setContentText(errorMessage);
            alert.showAndWait();
            return false;
        }
  }
}
