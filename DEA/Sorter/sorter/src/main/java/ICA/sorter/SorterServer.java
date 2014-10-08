package ICA.sorter;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;

public class SorterServer {	
	
	public static void main(String[] Args){		
		try {
			LocateRegistry.createRegistry(1100);
			Sorter sort1 = new Sorter();
			Naming.bind("//127.0.0.1:1100/sort1", sort1);		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
