package ICA.sorter;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface ISorter extends Remote{
	
	public int[] sorteer (int[] arrayOfNumbers) throws RemoteException ;
	
	public int[][] chunkArray(int[] array, int chunkSize) throws RemoteException;
	
	public ArrayList<int[]> splitArray(int[] arrayOfNumbers)
			throws RemoteException;
	
}
