package igra;

import java.io.*;
import java.util.*;

public class Rjecnik {
    
    Vector sveRijeci;

    public Rjecnik (String filename) 
    {
    	sveRijeci = new Vector();

		try 
		{	
		    BufferedReader citac = new BufferedReader(new InputStreamReader(new FileInputStream(filename), "UTF-8"));
		    while (citac.ready()) 
		    {
		    	sveRijeci.addElement(citac.readLine().trim().toUpperCase());
		    } 
		} 
		catch (IOException e) 
		{
		    System.out.println("Greska!!!!!!!!!!!!!!!");
		}
	    
    }

    public boolean provjeriRijec (String rijec) 
    {
    	return sveRijeci.contains(rijec);
    }

    
}

