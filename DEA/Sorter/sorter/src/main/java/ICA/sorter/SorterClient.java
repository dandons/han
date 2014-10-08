package ICA.sorter;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Random;


public class SorterClient extends UnicastRemoteObject {

	private static final long serialVersionUID = 1L;	
	
	protected SorterClient() throws RemoteException {
	}

	public static void main(String[] args) throws RemoteException, MalformedURLException, NotBoundException {
		SorterClient SC = new SorterClient();
		SC.sort();
	}
	
	public void sort() throws RemoteException, MalformedURLException, NotBoundException{
		ISorter sorter = new Sorter();
		sorter = (ISorter)Naming.lookup("//127.0.0.1:1100/sort1");
		int[] listOfNumbers = createListOfNumbers(20);		
		
		sendArrayToServer(listOfNumbers, sorter);
	}
	
	public int[] createListOfNumbers(int listSize){
		int[] listOfNumbers = new int[listSize];
		for(int i = 0; i < listSize; i++){
			Random rn = new Random();
			listOfNumbers[i] = rn.nextInt((1000 - -1000) + 1) + -1000; 
		}
		return listOfNumbers;
	}
	
	public void sendArrayToServer(int[] arrayOfNumbers, ISorter serverObject) throws RemoteException {
		ArrayList<ArrayList<Integer>> devidedNums = splitArray(arrayOfNumbers);
		
		for(ArrayList<Integer> listOfNums : devidedNums){
			serverObject.sort(listOfNums);
		}		
	}
	
	
    public ArrayList<ArrayList<Integer>> splitArray(int[] array) {
    	final int startNum = -1000;
        final int devideSize = 100;
        ArrayList<ArrayList<Integer>> devidedNums = new ArrayList<ArrayList<Integer>>();
        
        for(int numRange = 1; numRange <= 20; numRange++){
        	ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
            for(int num = 0; num < array.length; num++){
            	int highestNum = numRange*devideSize+startNum;
            	int lowestNum = (numRange*devideSize+startNum)-devideSize;
	        	if(array[num] <= highestNum && array[num] > lowestNum){
	            	listOfNumbers.add(array[num]);
	            }            	
            }
            devidedNums.add(listOfNumbers);
        }
        return devidedNums;
    }
    
	public int[] receiveArrayFromServer(ISorter sorter)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}    
    
	public int[] combineArrayFromServer(int[] arrayOfNumbers)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
}
