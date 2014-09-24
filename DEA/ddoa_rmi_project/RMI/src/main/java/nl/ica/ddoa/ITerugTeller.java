package nl.ica.ddoa;

import java.rmi.*;

public interface ITerugTeller extends Remote{


	public void setValue(int value) throws RemoteException;
	
	public int getValue() throws RemoteException;
	
	public void decrement() throws RemoteException;
	
	public void addCallBackListener(ICallback icb) throws RemoteException;
	
}
