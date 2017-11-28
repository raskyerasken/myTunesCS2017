/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytunes.GUI;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.media.Media;

/**
 *
 * @author mr.Andersen
 */
public class myTunesModel 
{
    private StringProperty fileName;
    private StringProperty path;
    private StringProperty album;
    private StringProperty artist;
    private StringProperty year;
    private StringProperty title;
    
    private Media tune;
    
    public myTunesModel() 
    {
        this(null, null, null);
    }

    public myTunesModel(String fileName, String path, Media tune) 
    {
        this.fileName = new SimpleStringProperty(fileName);
        this.path = new SimpleStringProperty(path);
        this.tune = tune;
    }

    public StringProperty getFileName() 
    {
        return fileName;
    }

    public void setFileName(StringProperty fileName) 
    {
        this.fileName = fileName;
    }

    public StringProperty getPath() 
    {
        return path;
    }

    public void setPath(StringProperty path) 
    {
        this.path = path;
    }

    public StringProperty getAlbum() 
    {
        return album;
    }

    public void setAlbum(StringProperty album) 
    {
        this.album = album;
    }

    public StringProperty getArtist() 
    {
        return artist;
    }

    public void setArtist(StringProperty artist) 
    {
        this.artist = artist;
    }

    public StringProperty getYear() 
    {
        return year;
    }

    public void setYear(StringProperty year) 
    {
        this.year = year;
    }

    public StringProperty getTitle() 
    {
        return title;
    }

    public void setTitle(StringProperty title) 
    {
        this.title = title;
    }

    public Media getTune() 
    {
        return tune;
    }

    public void setTune(Media tune) 
    {
        this.tune = tune;
    }
    
    
    
    
    
}
