/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytunes.DAL;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;
=======
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Platform;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.MediaPlayer;
import mytunes.BLL.BLLManager;
>>>>>>> 23e6a653d6fb81595d7926982c0c07d7a1324c9b
import mytunes.GUI.AddSongController;

/**
 *
 * @author mr.Andersen
 */
<<<<<<< HEAD
public class myTunesDAL 
{
        private ConnectionManager cm = new ConnectionManager();

        public List<AddSongController> getAllSongsByPlaylist(String songName, String Artist, String Album, int Year)
        {
            List<AddSongController> allSongs = new ArrayList();
=======
public class myTunesDAL {
    private ConnectionManager cm = new ConnectionManager();

    public List<AddSongController> getAllSongsByPlaylist(String songName, String Artist, String Album, int Year)
    {
        List<AddSongController> allSongs = new ArrayList();
>>>>>>> 23e6a653d6fb81595d7926982c0c07d7a1324c9b
        
    
        {
            AddSongController s = new AddSongController();
            allSongs.add(s);
        }
        
        return allSongs;
    }
<<<<<<< HEAD
=======
    
    public List<AddSongController> getAllSongs(String songName, String Artist, String Album, int Year)
    {
        List<AddSongController> allSongs = new ArrayList();
        {
            AddSongController s = new AddSongController();
            allSongs.add(s);
            
        }
        return allSongs;
    }
    
    public void remove(AddSongController selectedSong)
    {
        String sql = "DELETE FROM Songs WHERE id=?";
        
    }
    
    
  
    
>>>>>>> 23e6a653d6fb81595d7926982c0c07d7a1324c9b
    
    public List<AddSongController> getAllSongs(String songName, String Artist, String Album, int Year)
    {
        List<AddSongController> allSongs = new ArrayList();
        {
            AddSongController s = new AddSongController();
            allSongs.add(s);
            
        }
        return allSongs;
    }
    
    public void remove(AddSongController selectedSong)
    {
        String sql = "DELETE FROM Songs WHERE id=?";
        
    }
}

