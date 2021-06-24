package igra;

public class Slovo 
{    
	int brojBodova;
    String vlasnik;
    String slovo;
    int positionInImage=0;
    
    public int getPositionInImage()
    {
    	return positionInImage;
    }
    
    public Slovo (char s, int b, int position) {
    	new Slovo (s+"", b,  position);
    }
    
    public Slovo (String s, int b, int position) {
    	slovo = s;
		brojBodova = b;
		//System.out.println("bod:"+b);
    	
		positionInImage=position;
		vlasnik = new String("new");
   }
    
    public char vratiSlovoKarakter () {
    	return slovo.charAt(0);
    }
    
    public String vratiSlovoString() {
    	return slovo;
    }

    public void postaviSlovo(String l) {
	slovo = l;
    }
    
    public void postaviVlasnika (String o) {
    	vlasnik = new String(o);
    }

    public String vratiVlasnika() {
    	return vlasnik;
    }

    public int vratiBrojBodova() 
    {
    	return brojBodova;
    }
}

