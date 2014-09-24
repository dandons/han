package ICA.sorter;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Arrays;

public class Sorter extends UnicastRemoteObject implements ISorter, Serializable {

	private static final long serialVersionUID = 1L;

	protected Sorter() throws RemoteException {
		super();
	}

	public int[] sorteer(int[] arrayOfNumbers) {
		if(arrayOfNumbers != null){
			Arrays.sort(arrayOfNumbers);
		}
		return arrayOfNumbers;
	}
}
