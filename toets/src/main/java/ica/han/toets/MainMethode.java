package ica.han.toets;

public class MainMethode 
{
	public static void main(String[] args) {
		
		
		// Opgave 3
		System.out.println("Opgave 3");
		Kaart k1 = new Kaart("kees",25);
		System.out.println(k1.toString());
		
		// Opgave 4
		System.out.println("Opgave 4");
		Kaartenbak bak = new Kaartenbak();
		Kaart k2;
		for (int i = 0; i<4;i++){
			k2 = bak.getKaart();
			System.out.println(k2.toString());
		}
		
		// Opgave 5
		KaartUtil ku = new KaartUtil();
		Kaart k3 = new Kaart ("Jan",55);
		Kaart k4 = new Kaart ("Michel", 50);
		Kaart k5 = ku.add(k3, k4);
		System.out.println(k5.toString());
	}
}
