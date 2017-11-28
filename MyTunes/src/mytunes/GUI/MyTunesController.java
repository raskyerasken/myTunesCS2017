/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytunes.GUI;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.MediaPlayer;
import mytunes.BLL.BLLManager;
import static sun.audio.AudioPlayer.player;


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
    @FXML
    private ImageView playBtn;
    @FXML
    private ImageView backBtn;
    @FXML
    private ImageView nextBtn;
    @FXML
    private ImageView pauseBtn;
    private MediaPlayer player;
    

    
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
    private void playBtn() 
    {
        System.out.println("lalal");
        if(player != null) {
            boolean playing = player.getStatus().equals(MediaPlayer.Status.PLAYING);
            if(playing) {
                player.pause();
                System.out.println("lol");
            } else {
                player.play();
                System.out.println("lolz");
            }
        }
    }


    @FXML
    private void play(MouseEvent event) {
        System.out.println("play");
    }

    @FXML
    private void lastSong(MouseEvent event) {
        System.out.println("last");
    }

    @FXML
    private void pause(MouseEvent event) {
        System.out.println("pause");
    }

    @FXML
    private void nextSong(MouseEvent event) {
        System.out.println("next");
    }
 
    
    
}
