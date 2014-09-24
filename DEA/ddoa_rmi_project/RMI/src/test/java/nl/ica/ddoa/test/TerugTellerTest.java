package nl.ica.ddoa.test;

import java.rmi.RemoteException;

import nl.ica.ddoa.TerugTeller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import junit.textui.TestRunner;

public class TerugTellerTest extends TestCase {
	TerugTeller teller;
	
	public static void main(String[] args){
		TestRunner.run(TerugTellerTest.class);
	}
	
	@Before
	protected void setUp() throws Exception {
		teller = new TerugTeller();
	}

	public void testGetValue()throws RemoteException{
		teller.setValue(10);
		Assert.assertEquals(teller.getValue(), 10);
	}
	
	public void testDecrement() throws RemoteException{
		teller.setValue(10);
		teller.decrement();
		Assert.assertEquals(teller.getValue(), 9);
	}

}
