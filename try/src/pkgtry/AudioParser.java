package pkgtry;

import java.io.IOException;
import java.io.RandomAccessFile;

import com.mpatric.mp3agic.ID3v1;
import com.mpatric.mp3agic.ID3v1Tag;
import com.mpatric.mp3agic.ID3v2;
import com.mpatric.mp3agic.ID3v24Tag;
import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.NotSupportedException;
import com.mpatric.mp3agic.UnsupportedTagException;
import javax.swing.JFileChooser;

public class AudioParser {

    public static void main(String[] args) throws UnsupportedTagException, InvalidDataException, IOException, NotSupportedException {
       JFileChooser chooser = new JFileChooser();
chooser.setCurrentDirectory(new java.io.File("."));
chooser.setDialogTitle("choosertitle");



if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
 
  System.out.println("getSelectedFile() : " + chooser.getSelectedFile());
} else {
  System.out.println("No Selection ");
}
        
        Mp3File mp3file = new Mp3File("src/test/resources/2cent.mp3");

        System.out.println("Length of this mp3 is: " + mp3file.getLengthInSeconds() + " seconds");
      
        System.out.println("Has ID3v2 tag?: " + (mp3file.hasId3v2Tag() ? "YES" : "NO"));
       
      if (mp3file.hasId3v2Tag()) {
        	ID3v2 id3v2Tag = mp3file.getId3v2Tag();
        	
        	System.out.println("Artist: " + id3v2Tag.getArtist());
        	System.out.println("Title: " + id3v2Tag.getTitle());
        	System.out.println("Album: " + id3v2Tag.getAlbum());
        	System.out.println("Year: " + id3v2Tag.getYear());
        	System.out.println("Genre: " + id3v2Tag.getGenre() + " (" + id3v2Tag.getGenreDescription() + ")");
        	
        }
        
        if (mp3file.hasId3v2Tag()) {
        	ID3v2 id3v2Tag = mp3file.getId3v2Tag();
            byte[] imageData = id3v2Tag.getAlbumImage();
            if (imageData != null) {
				String mimeType = id3v2Tag.getAlbumImageMimeType();
				System.out.println("Mime type: " + mimeType);
				
				RandomAccessFile file = new RandomAccessFile("album-artwork", "rw");
				file.write(imageData);
				file.close();
            }
        }
	}
}
