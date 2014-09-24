package nl.ica.ddoa;

import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class TerugTellerClient extends UnicastRemoteObject implements ICallback{
	
	public TerugTellerClient ()  throws RemoteException{
		ITerugTeller teller = null;
		try {
			teller = (ITerugTeller)Naming.lookup("//localhost:1100/terugteller");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		teller.setValue(200);
		for(int i = 0; i < 100; i++){
			teller.decrement();
			notifyChange(teller);
		}
	}
	
	public static void main(String[] args) throws RemoteException {
		TerugTellerClient client = new TerugTellerClient();
	}

	public void notifyChange(ITerugTeller teller) throws RemoteException {
		teller.addCallBackListener(this);
		if(teller.getValue() %25 == 0){
			System.out.println(teller.getValue());
		}
		
	}
}
