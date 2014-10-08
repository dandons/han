package ICA.sorter;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface ISorter extends Remote{
	
	public ArrayList<Integer> sort (ArrayList<Integer> arrayOfNumbers) 
			throws RemoteException ;
	
}
