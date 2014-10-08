package ica.han.toets;


import junit.framework.TestCase;

public class KaartTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}
	
	public void testEmptyStringScenario() {
		Kaart emptyKaart = new Kaart("", 0);
		
		assertEquals(emptyKaart.getNaam(),"");
		assertEquals(emptyKaart.getWaarde(), 0);
	}
	
	
	public void testMinusScenario() {
		Kaart kaartTest01 = new Kaart("kaartTest01", -2);
		Kaart kaartTest02 = new Kaart("kaartTest02", -999999);
		
		assertEquals(kaartTest01.getNaam(),"kaartTest01");
		assertEquals(kaartTest01.getWaarde(), 0);
		
		assertEquals(kaartTest02.getNaam(),"kaartTest02");
		assertEquals(kaartTest02.getWaarde(), 0);
	}
	
	public void testHappyScenario() {
		Kaart kaartTest01 = new Kaart("kaartTest01", 2);
		Kaart kaartTest02 = new Kaart("kaartTest02", 50);
		Kaart kaartTest03 = new Kaart("kaartTest03", 98);
		
		assertEquals(kaartTest01.getNaam(),"kaartTest01");
		assertEquals(kaartTest01.getWaarde(), 2);
		
		assertEquals(kaartTest02.getNaam(),"kaartTest02");
		assertEquals(kaartTest02.getWaarde(), 50);
		
		assertEquals(kaartTest03.getNaam(),"kaartTest03");
		assertEquals(kaartTest03.getWaarde(), 98);
	}
	
	public void testBorderScenario() {
		Kaart kaartTest01 = new Kaart("kaartTest01",0);
		Kaart kaartTest02 = new Kaart("kaartTest02", 100);
		
		assertEquals(kaartTest01.getNaam(),"kaartTest01");
		assertEquals(kaartTest01.getWaarde(), 0);
		
		assertEquals(kaartTest02.getNaam(),"kaartTest02");
		assertEquals(kaartTest02.getWaarde(), 100);
	}
	


}
