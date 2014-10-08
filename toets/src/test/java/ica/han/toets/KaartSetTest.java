package ica.han.toets;


import junit.framework.TestCase;

public class KaartSetTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}
		
	public void testMinusScenario() {
		Kaart kaartTest01 = new Kaart("kaartTest01", 50);
		Kaart kaartTest02 = new Kaart("kaartTest02", 50);
		
		kaartTest01.setWaarde(-2);
		kaartTest02.setWaarde(-9999);
		
		assertEquals(kaartTest01.getNaam(),"kaartTest01");
		assertEquals(kaartTest01.getWaarde(), 0);
		
		assertEquals(kaartTest02.getNaam(),"kaartTest02");
		assertEquals(kaartTest02.getWaarde(), 0);
	}
	
	public void testHappyScenario() {
		Kaart kaartTest01 = new Kaart("kaartTest01", 20);
		Kaart kaartTest02 = new Kaart("kaartTest02", 20);
		Kaart kaartTest03 = new Kaart("kaartTest03", 20);
		
		kaartTest01.setWaarde(2);
		kaartTest02.setWaarde(50);
		kaartTest03.setWaarde(98);
		
		assertEquals(kaartTest01.getNaam(),"kaartTest01");
		assertEquals(kaartTest01.getWaarde(), 2);
		
		assertEquals(kaartTest02.getNaam(),"kaartTest02");
		assertEquals(kaartTest02.getWaarde(), 50);
		
		assertEquals(kaartTest03.getNaam(),"kaartTest03");
		assertEquals(kaartTest03.getWaarde(), 98);
	}
	
	public void testBorderScenario() {
		Kaart kaartTest01 = new Kaart("kaartTest01", 50);
		Kaart kaartTest02 = new Kaart("kaartTest02", 50);
		
		kaartTest01.setWaarde(0);
		kaartTest02.setWaarde(100);
		
		assertEquals(kaartTest01.getNaam(),"kaartTest01");
		assertEquals(kaartTest01.getWaarde(), 0);
		
		assertEquals(kaartTest02.getNaam(),"kaartTest02");
		assertEquals(kaartTest02.getWaarde(), 100);
	}
	


}
