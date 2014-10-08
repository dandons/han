package ica.han.toets;

import org.kohsuke.randname.RandomNameGenerator;

public class Kaartenbak {
	RandomNameGenerator rnd = new RandomNameGenerator();
	
	public Kaart getKaart(){
		String naam = rnd.next();
		int number = 1 + (int)(Math.random()*100); 
		
		Kaart kaart = new Kaart(naam, number);
		return kaart;		
	}
}
