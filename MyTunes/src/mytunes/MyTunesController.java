/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytunes;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableListBase;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;

/**
 *
 * @author jacob
 */
public class MyTunesController implements Initializable {
    
    private Label label;
    @FXML
    private ListView<?> ListSongPlaylist;
    @FXML
    private Label labelSongTheirIsPlaying;
    @FXML
    private TextField textFieldFilter;
    private ObservableList<String> playlist; 
    @FXML
    private TableColumn<?, ?> columName;
    @FXML
    private TableColumn<?, ?> columSongs;
    @FXML
    private TableColumn<?, ?> colomTime;
    @FXML
    private TableColumn<?, ?> listSongTitle;
    @FXML
    private TableColumn<?, ?> listSongArtist;
    @FXML
    private TableColumn<?, ?> listSongCategory;
    @FXML
    private TableColumn<?, ?> listSongTime;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
        
        // hej med dig
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        playlist= FXCollections.observableArrayList();
     
    }    

    @FXML
    private void newPlaylist(ActionEvent event) {
    }

    @FXML
    private void editPlaylist(ActionEvent event) {
    }

    @FXML
    private void deletePlaylist(ActionEvent event) {
    }

    @FXML
    private void upPlaylistSongs(ActionEvent event) {
    }

    @FXML
    private void downPlaylistSongs(ActionEvent event) {
    }

    @FXML
    private void addSongToPlaylist(ActionEvent event) {
    }

    @FXML
    private void deleteSongOnPlaylist(ActionEvent event) {
    }

    @FXML
    private void newSong(ActionEvent event) {
    }

    @FXML
    private void editSong(ActionEvent event) {
    }

    @FXML
    private void DeleteSong(ActionEvent event) {
    }

    @FXML
    private void closeProgram(ActionEvent event) {
    }

    @FXML
    private void songBeforeOnPlaylist(ActionEvent event) {
    }

    private void play(ActionEvent event) throws FileNotFoundException, IOException  {
      
   AudioPlayer MGP = AudioPlayer.player;
   AudioStream BGM;
   AudioData MD;
        ContinuousAudioDataStream loop =null;
        BGM= new AudioStream(new FileInputStream("jacob.mp3"));
        MD= BGM.getData();
        loop = new ContinuousAudioDataStream(MD);    }

    @FXML
    private void nextSongOnPlaylist(ActionEvent event) {
    }

    @FXML
    private void play(MouseEvent event) {
    }

    @FXML
    private void play(DragEvent event) {
    }
    
}
