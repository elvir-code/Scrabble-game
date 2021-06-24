package igra;
import java.io.*;
import java.awt.*;

import javax.imageio.ImageIO;

public class PrikazSlike extends Canvas {
	Image slika=null;
	int sirina, visina;
	String fileName;
	
    public PrikazSlike (String file, int s,int v) 
    {
    	fileName = file;
    	sirina = s;
    	visina = v;
	
    	File fileSlova = new File(fileName);

		try 
		{
			slika = ImageIO.read(fileSlova);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
    }

    public void paint (Graphics g) 
    {
    	g.setPaintMode();
		Graphics2D g2 = (Graphics2D) g;
		g2.drawImage(slika, 0,0,sirina,visina, 0,
				0, sirina, visina,
	    		null);
	    

    }
}
