/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytunes.GUI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
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
    private ListView<String> ListSongPlaylist;
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
    @FXML
    private ImageView playBtn;
    @FXML
    private ImageView backBtn;
    @FXML
    private ImageView nextBtn;
    @FXML
    private ImageView pauseBtn;
    @FXML
    private TableView<String> TbwSongs;
    
    private void handleButtonAction(ActionEvent event) {
        
        // hej med dig
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        playlist= FXCollections.observableArrayList();
     
    }    

    @FXML
    private void newPlaylist(ActionEvent event) {
        try {
            Stage newStage = new Stage();
            FXMLLoader fxLoader = new FXMLLoader(getClass().getResource("playListView.fxml"));

            Parent root = fxLoader.load();
            PlayListController controller
                    = fxLoader.getController();


            Scene scene = new Scene(root);
            newStage.setScene(scene);
            newStage.show();
        }
            
        catch (IOException ex) {
            Logger.getLogger(PlayListController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void editPlaylist(ActionEvent event) {
        try {
            Stage newStage = new Stage();
            FXMLLoader fxLoader = new FXMLLoader(getClass().getResource("playListView.fxml"));

            Parent root = fxLoader.load();
            PlayListController controller
                    = fxLoader.getController();


            Scene scene = new Scene(root);
            newStage.setScene(scene);
            newStage.show();
        }
            
        catch (IOException ex) {
            Logger.getLogger(PlayListController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void deletePlaylist(ActionEvent event) {
    }
    
    @FXML
    private void addToPlaylist(ActionEvent event) {
        String song = TbwSongs.getSelectionModel().getSelectedItem();
        ListSongPlaylist.getItems().add(song);
    }
    
    @FXML
    private void deleteSongOnPlaylist(ActionEvent event) {
    }

    @FXML
    private void newSong(ActionEvent event) {
        try {
            Stage newStage = new Stage();
            FXMLLoader fxLoader = new FXMLLoader(getClass().getResource("songView.fxml"));

            Parent root = fxLoader.load();
            SongViewController controller
                    = fxLoader.getController();


            Scene scene = new Scene(root);
            newStage.setScene(scene);
            newStage.show();
        }
            
        catch (IOException ex) {
            Logger.getLogger(PlayListController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void editSong(ActionEvent event) {
    }

    @FXML
    private void DeleteSong(ActionEvent event) {
    }

    @FXML
    private void closeProgram(ActionEvent event) {
        System.exit(0);
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
    private void play(MouseEvent event) {
    }

    @FXML
    private void lastSong(MouseEvent event) {
    }

    @FXML
    private void pause(MouseEvent event) {
    }

    @FXML
    private void nextSong(MouseEvent event) {
    }
    
}
