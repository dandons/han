package ica.han.toets;
import java.rmi.*;

public interface IKaart extends Remote {
	public Kaart add(Kaart k1, Kaart k2) throws RemoteException;

}
