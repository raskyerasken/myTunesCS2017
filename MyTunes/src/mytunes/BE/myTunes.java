/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytunes.BE;

import java.util.ArrayList;
import java.util.List;
import mytunes.GUI.AddSongController;

/**
 *
 * @author mr.Andersen
 */
public class myTunes {
    
    private String songName;
    private String artist;
    private String album;
    private int year;
    
    public String getSongName()
    {
        return songName;
    }
    
    public void setSongName()
    {
        this.songName = songName;
    }
    
    public String getArtist()
    {
        return artist;
    }
    public void setArtist()
    {
        this.artist = artist;
    }
    
    public String getAlbum()
    {
        return album;
    }
    
    public void setAlbum()
    {
        this.album = album;
    }
    
    public int getYear()
    {
        return year;
    }
    
    public void setYear(){
        this.year = year;
           
    }

    @Override
    public String toString() {
        return "myTunes{" + "songName=" + songName + ", artist=" + artist + ", album=" + album + ", year=" + year + '}';
    }

    
    
}
