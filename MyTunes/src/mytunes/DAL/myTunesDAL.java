/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytunes.DAL;

import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FilenameFilter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Platform;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.MediaPlayer;
import mytunes.BE.myTunes;
import mytunes.BLL.BLLManager;
import mytunes.GUI.AddSongController;

/**
 *
 * @author mr.Andersen
 */

            
public class myTunesDAL {
    private ConnectionManager cm = new ConnectionManager();

    public List<AddSongController> getAllSongsByPlaylist(String songName, String Artist, String Album, int Year)
    {
        List<AddSongController> allSongs = new ArrayList();
        
    
        {
            AddSongController s = new AddSongController();
            allSongs.add(s);
        }
        
        return allSongs;
    }
    
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
    
    public void add (myTunes allSongs) throws SQLException
    {
                 try (Connection con = cm.getConnection())  {

        String sql 
                = "INSERT INTO Songs"
                + "(songName, artist, album, year)"
                + "VALUES(?, ?, ?, ?)";
           PreparedStatement pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
           
            pstmt.setString(1, allSongs.getSongName());
            pstmt.setString(2, allSongs.getArtist());
            pstmt.setString(3, allSongs.getAlbum());
            pstmt.setInt(4, allSongs.getYear());
            
            int affected = pstmt.executeUpdate();
            if (affected<1)
                    throw new SQLException("Song could not be added");
            
            
                    
                    
                  
    }
  }
}
    
  
    
    
 

