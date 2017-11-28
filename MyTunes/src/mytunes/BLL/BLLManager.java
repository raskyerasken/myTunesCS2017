/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytunes.BLL;

import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.media.MediaPlayer;
<<<<<<< HEAD
=======
import mytunes.BE.myTunes;
>>>>>>> 23e6a653d6fb81595d7926982c0c07d7a1324c9b
import mytunes.DAL.myTunesDAL;
import mytunes.GUI.AddSongController;
import static sun.audio.AudioPlayer.player;

/**
 *
 * @author mr.Andersen
 */
public class BLLManager 
{
<<<<<<< HEAD
    myTunesDAL mtdal = new myTunesDAL();
   
    public List<AddSongController> getAllSongs(String songName, String Artist, String Album, int Year){
        return mtdal.getAllSongs(songName, Artist, Album, 0);
=======
    
    myTunesDAL mtdal = new myTunesDAL();
   
    public List<AddSongController> getAllSongs(String songName, String Artist, String Album, int Year){
        return mtdal.getAllSongs();
>>>>>>> 23e6a653d6fb81595d7926982c0c07d7a1324c9b
    }
    
    public List<AddSongController> getAllSongsByPlaylist(String songName, String Artist, String Album, int Year)
    {
        return mtdal.getAllSongsByPlaylist(songName, Artist, Album, 0);
    }
}

