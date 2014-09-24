package ICA.sorter;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;

public class SortServer {	
	
	public void main(String[] Args){		
		try {
			LocateRegistry.createRegistry(1200);
			Sorter sort1 = new Sorter();
			Sorter sort2 = new Sorter();
			Naming.bind("//127.0.0.1:1200/sort1", sort1);
			Naming.bind("//127.0.0.1:1200/sort2", sort2);		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
