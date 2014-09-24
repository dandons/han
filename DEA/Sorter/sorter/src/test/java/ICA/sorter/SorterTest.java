package ICA.sorter;

import java.rmi.RemoteException;

import junit.framework.TestCase;

public class SorterTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}
	
	public void testEmptyScenario() throws RemoteException{
		int[] arrayOfIntsBefore = new int[]{};
		int[] arrayOfIntsSuccess = new int[]{};
		Sorter sorter = new Sorter();
		
		for(int i = 0; i < arrayOfIntsSuccess.length; i++){
			assertEquals(arrayOfIntsSuccess[i], sorter.sorteer(arrayOfIntsBefore)[i]);
		}		
	}
	
	public void testNullScenario() throws RemoteException{
		int[] arrayOfIntsBefore = null;
		Sorter sorter = new Sorter();
		assertEquals(null, sorter.sorteer(arrayOfIntsBefore));	
	}
	
	public void testMinusScenario() throws RemoteException{
		int[] arrayOfIntsBefore = new int[]{-0, -99, -401, -999, -2, -600, -80, -140, -760, -820, -320, -384};
		int[] arrayOfIntsSuccess = new int[]{-999, -820, -760, -600, -401, -384, -320, -140, -99, -80, -2, -0};
		Sorter sorter = new Sorter();
		
		for(int i = 0; i < arrayOfIntsSuccess.length; i++){
			assertEquals(arrayOfIntsSuccess[i], sorter.sorteer(arrayOfIntsBefore)[i]);
		}		
	}
	
	public void testHappyScenario1() throws RemoteException{
		int[] arrayOfIntsBefore = new int[]{0, 99, 401, 999, 2, 600, 80, 140, 760, 820, 320, 384};
		int[] arrayOfIntsSuccess = new int[]{0, 2, 80, 99, 140, 320, 384, 401, 600, 760, 820, 999};
		Sorter sorter = new Sorter();
		
		for(int i = 0; i < arrayOfIntsSuccess.length; i++){
			assertEquals(arrayOfIntsSuccess[i], sorter.sorteer(arrayOfIntsBefore)[i]);
		}
	}
	
	public void testHappyScenario2() throws RemoteException{
		int[] arrayOfIntsBefore = new int[]{77, 29, 429, 97, 5, 4, 871, 989, 674, 810, 225, 781};
		int[] arrayOfIntsSuccess = new int[]{4, 5, 29, 77, 97, 225, 429, 674, 781, 810, 871, 989};
		Sorter sorter = new Sorter();
		
		for(int i = 0; i < arrayOfIntsSuccess.length; i++){
			assertEquals(arrayOfIntsSuccess[i], sorter.sorteer(arrayOfIntsBefore)[i]);
		}		
	}
	
	public void testBorderScenario() throws RemoteException{
		int[] arrayOfIntsBefore = new int[]{0, -2147483648, -2147483648, -2147483648, 2147483647, 2147483647, 2147483647, 0, 0, -2147483648, -2147483648, 2147483647};
		int[] arrayOfIntsSuccess = new int[]{-2147483648, -2147483648, -2147483648, -2147483648, -2147483648, 0, 0, 0, 2147483647, 2147483647, 2147483647, 2147483647};
		Sorter sorter = new Sorter();
		
		for(int i = 0; i < arrayOfIntsSuccess.length; i++){
			assertEquals(arrayOfIntsSuccess[i], sorter.sorteer(arrayOfIntsBefore)[i]);
		}		
	}
	
	public void testRunnedScenario() throws RemoteException{
		int[] arrayOfIntsBefore = new int[]{0, 99, 401, 999, 2, 600, 80, 140, 760, 820, 320, 384};
		int[] arrayOfIntsSuccess = new int[]{0, 2, 80, 99, 140, 320, 384, 401, 600, 760, 820, 999};
		
		Sorter sorter = new Sorter();		
		int[] arrayOfIntsAfter = sorter.sorteer(arrayOfIntsBefore);		
		
		for(int i = 0; i < arrayOfIntsSuccess.length; i++){
			assertEquals(arrayOfIntsSuccess[i], sorter.sorteer(arrayOfIntsAfter)[i]);
		}		
	}

}
