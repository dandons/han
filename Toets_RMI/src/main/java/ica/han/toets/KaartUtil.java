package ica.han.toets;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class KaartUtil extends UnicastRemoteObject implements Serializable, IKaart {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected KaartUtil() throws RemoteException {
	}

	public Kaart add(Kaart k1, Kaart k2) throws RemoteException{		
		String nieuweNaam = k1.getNaam() + k2.getNaam();
		int nieuwGetal = k1.getWaarde() + k2.getWaarde();
		Kaart returnKaart = new Kaart(nieuweNaam, nieuwGetal);
		return returnKaart;
	}
}
