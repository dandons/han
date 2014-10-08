package ica.han.toets;

import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class KaartClient extends UnicastRemoteObject{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6947956974084695376L;

	public KaartClient ()  throws RemoteException{
		IKaart util = null;
		try {
			util = (IKaart)Naming.lookup("//localhost:1200/kaart");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
		Kaart k1 = new Kaart("Piet", 10);
		Kaart k2 = new Kaart("Kees", 10);
		Kaart nieuweKaart = util.add(k1, k2);
		nieuweKaart.toString();
	}
	
	public static void main(String[] args) throws RemoteException {
		KaartClient client = new KaartClient();
	}
}
