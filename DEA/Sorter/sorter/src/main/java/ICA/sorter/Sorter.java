package ICA.sorter;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Arrays;

public class Sorter extends UnicastRemoteObject implements ISorter, Serializable {

	protected Sorter() throws RemoteException {
	}

	private static final long serialVersionUID = 1L;

	public int[] sorteer(int[] arrayOfNumbers) throws RemoteException {
		if(arrayOfNumbers != null){
			Arrays.sort(arrayOfNumbers);
		}
		return arrayOfNumbers;
	}

	public ArrayList<int[]> splitArray(int[] arrayOfNumbers)
			throws RemoteException {
		
		
		
		int[][] arrayInChunks = chunkArray(arrayOfNumbers, (arrayOfNumbers.length/3));
		for(int i = 0; i < arrayInChunks.length; i++){
			
		}
		
		// TODO Auto-generated method stub
		return null;
	}
	
    public int[][] chunkArray(int[] array, int chunkSize) {
        int numOfChunks = (int)Math.ceil((double)array.length / chunkSize);
        int[][] output = new int[numOfChunks][];
 
        for(int i = 0; i < numOfChunks; ++i) {
            int start = i * chunkSize;
            int length = Math.min(array.length - start, chunkSize);
 
            int[] temp = new int[length];
            System.arraycopy(array, start, temp, 0, length);
            output[i] = temp;
        }
 
        return output;
    }

	
}
