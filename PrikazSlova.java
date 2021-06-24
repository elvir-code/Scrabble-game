package igra;
import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

import javax.imageio.ImageIO;

public class PrikazSlova extends Canvas {
  
    Vector letters;

    public PrikazSlova (Vector l) {
    	letters = l;
    }

    public void paint (Graphics g) { 	
    	File file = new File("slova.gif");
		Image slika1=null;
		try {
			slika1 = ImageIO.read(file);
		} catch (IOException e) {
			e.printStackTrace();
		}

		int pos=0;
		for (int i=0; i<letters.size(); i++) {
			    pos = ((Slovo)letters.elementAt(i)).getPositionInImage();
			    g.drawImage(slika1, i*40+8,8, i*40+37, 37, pos * 29, 0, (pos + 1) * 29, 29,
			    		null);
		}
    }

}

