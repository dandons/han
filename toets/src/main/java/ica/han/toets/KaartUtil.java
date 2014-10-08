package ica.han.toets;

public class KaartUtil {
	
	public Kaart add(Kaart k1, Kaart k2){		
		String nieuweNaam = k1.getNaam() + k2.getNaam();
		int nieuwGetal = k1.getWaarde() + k2.getWaarde();
		Kaart returnKaart = new Kaart(nieuweNaam, nieuwGetal);
		return returnKaart;
	}
}
