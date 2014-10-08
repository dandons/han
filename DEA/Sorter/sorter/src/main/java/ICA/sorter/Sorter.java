package ICA.sorter;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Collections;

public class Sorter extends UnicastRemoteObject implements ISorter, Serializable {

	protected Sorter() throws RemoteException {
		
	}

	private static final long serialVersionUID = 1L;

	public ArrayList<Integer> sort(ArrayList<Integer> arrayOfNumbers) throws RemoteException {
		if(arrayOfNumbers != null){
			Collections.sort(arrayOfNumbers);
		}
		return arrayOfNumbers;
	}	
}
