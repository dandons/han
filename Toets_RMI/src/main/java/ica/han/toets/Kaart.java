package ica.han.toets;

public class Kaart {

	private String naam;
	private int waarde;
	
	public Kaart(String naam, int waarde){
		setNaam(naam);
		setWaarde(waarde);
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public int getWaarde() {
		return waarde;
	}

	public void setWaarde(int incommingWaarde) {
		if(incommingWaarde > 100){
			incommingWaarde = 100;
		}if(incommingWaarde < 0){
			incommingWaarde = 0;
		}
		waarde = incommingWaarde;
	}
	
	public String toString(){
		return "Naam: "+naam+" "+"Waarde: "+waarde;
	}
	
	
}
