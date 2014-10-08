package ica.han.toets;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class KaartServer {

	public static void main(String[] args) {
		try {
			LocateRegistry.createRegistry(1100);
			IKaart util = new KaartUtil();
			Naming.bind("//localhost:1100/kaart", util);		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}






