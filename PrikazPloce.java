package igra;
import java.io.*;
import java.awt.*;

import javax.imageio.ImageIO;

public class PrikazPloce extends Canvas {
	
	Image slikaPozadina=null, slikaSlovo=null;
	Polje[][] ploca;
    int velicina;    

    public PrikazPloce (Polje[][] b, int s) 
    {
    	ploca = b;
    	velicina = s;
	
    	File fileSlova = new File("slova.gif");

		try 
		{
			slikaSlovo = ImageIO.read(fileSlova);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	
		File fileTable = new File("tabla.jpg");
		try 
		{
			slikaPozadina = ImageIO.read(fileTable);
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
    	for (int i=0; i<velicina; i++)
    	{
    		for (int j=0; j<velicina; j++) 
    		{
    			Polje c = ploca[i][j];
    			g2.drawImage(slikaPozadina, i*29,j*29,i*29+29,j*29+29, i * 29,
    					j*29, (i + 1) * 29, (j+1)*29,
			    		null);
    			if (c.zauzeto()) 
    			{
					int pos = c.vratiSlovo().getPositionInImage();  
					g2.drawImage(slikaSlovo, i*29,j*29,i*29+29,j*29+29, pos * 29, 0, (pos + 1) * 29, 29,
					    		null);
				
    			}
    		}
		}
	    

    }
}