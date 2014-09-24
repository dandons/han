package nl.ica.ddoa;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICallback extends Remote{
	
	public void notifyChange (ITerugTeller teller) throws RemoteException;
	
}