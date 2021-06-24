package igra;
import java.awt.*;
public class PrikazRezultata extends Canvas 
{
	
    int rezultatIgrac1 = 0,rezultatIgrac2 = 0,rezultatIgrac3 = 0,rezultatIgrac4 = 0;
    int brojIgraca;
    String igrac1, igrac2, igrac3, igrac4;

    public PrikazRezultata() {
    	
    }
    
    public String vratiPobjednika()
    {
    	if(rezultatIgrac1 > rezultatIgrac2
    			&& rezultatIgrac1 > rezultatIgrac3
    			&& rezultatIgrac1 > rezultatIgrac4)
    		return igrac1;
    	else if(rezultatIgrac2 > rezultatIgrac1
    			&& rezultatIgrac2 > rezultatIgrac3
    			&& rezultatIgrac2 > rezultatIgrac4)
    		return igrac2;
    	else if(rezultatIgrac3 > rezultatIgrac1
    			&& rezultatIgrac3 > rezultatIgrac2
    			&& rezultatIgrac3 > rezultatIgrac4)
    		return igrac3; 

    	else if(rezultatIgrac4 > rezultatIgrac1
    			&& rezultatIgrac4 > rezultatIgrac2
    			&& rezultatIgrac4 > rezultatIgrac3)
    		return igrac4; 
    	else
    		return "nepoznat";
    }

    public void paint (Graphics g) 
    {
    	Font font = new Font("Tahoma", 0, 16);
    	g.setPaintMode();
		g.setFont(font);
		g.setColor(Color.green);
		g.fillRect(0,0,299,200);

		g.setColor(Color.red);
		g.drawString("Rezultati",1,20);
		
		font = new Font("Tahoma", 0, 14);
		
		g.setColor(Color.red);
		g.drawString(igrac1+":",0,60);

	    g.setColor(Color.black);
	    g.drawString(rezultatIgrac1+"",76,60);
	    
		g.setColor(Color.red);
		g.drawString(igrac2+":",0,100);

	    g.setColor(Color.black);
	    g.drawString(rezultatIgrac2+"",76,100);
	    
	    if(brojIgraca < 3)
	    	return;
	    
		g.setColor(Color.red);
		g.drawString(igrac3+":",0,140);

	    g.setColor(Color.black);
	    g.drawString(rezultatIgrac3+"",76,140);
			  
	    if(brojIgraca < 4)
	    	return;
	    
		g.setColor(Color.red);
		g.drawString(igrac4+":",0,180);

	    g.setColor(Color.black);
	    g.drawString(rezultatIgrac4+"",76,180);
		
    }

    public void postaviNaziveIgraca(String Igrac1, String Igrac2, String Igrac3, String Igrac4) {
    	igrac1 = Igrac1;
    	igrac2 = Igrac2;
    	igrac3 = Igrac3;
    	igrac4 = Igrac4;
    }
    
    public void dodajBodovaIgracu1(int b) {
    	rezultatIgrac1 += b;
    }
    
    public void dodajBodovaIgracu2(int b) {
    	rezultatIgrac2 += b;
    }
    
    public void dodajBodovaIgracu3(int b) {
    	rezultatIgrac3 += b;
    }
    public void dodajBodovaIgracu4(int b) {
    	rezultatIgrac4 += b;
    }

    public int brojBodova(String s) 
    {
    	return rezultatIgrac1;
    }
    
    public void postaviBrojIgraca(int broj){
    	brojIgraca=broj;
    }
}

