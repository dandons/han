package nl.ica.ddoa;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class TerugTeller extends UnicastRemoteObject implements ITerugTeller, Serializable {

	private int count;
	ArrayList<ICallback> listeners = new ArrayList<ICallback>();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TerugTeller () throws RemoteException{
		count = 0;
	}
	
	
	public void setValue(int value) throws RemoteException {
		count = value;

	}

	public int getValue() throws RemoteException {
		return count;

	}

	public void decrement() throws RemoteException {
		count--;
	}

	public void addCallBackListener(ICallback icb) throws RemoteException {
		listeners.add(icb);		
	}	

}
