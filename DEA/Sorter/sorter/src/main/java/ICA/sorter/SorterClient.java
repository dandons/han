package ICA.sorter;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Arrays;
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
		ISorter s1 = new Sorter();
		ISorter s2 = new Sorter();
		s1 = (ISorter)Naming.lookup("//127.0.0.1:1100/sort1");
		s2 = (ISorter)Naming.lookup("//127.0.0.1:1100/sort2");
		
		int[] listOfNumbers = new int[20];
		for(int i = 0; i < 20; i++){
			Random rn = new Random();
			listOfNumbers[i] = rn.nextInt((1000 - -1000) + 1) + -1000; 
		}

		System.out.println(Arrays.toString(s1.sorteer(listOfNumbers)));
		System.out.println(Arrays.toString(s2.sorteer(listOfNumbers)));
	}
}
