package nl.ica.ddoa;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class TerugTellerServer {

	public static void main(String[] args) {
		ITerugTeller teller;
		try {
			Registry r = LocateRegistry.createRegistry(1100);
			teller = new TerugTeller();
			Naming.bind("//127.0.0.1:1100/terugteller", teller);		
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
