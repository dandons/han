package amdahl;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 * Unit test for simple App.
 */
public class AmdahlTest 
    extends TestCase
{
	@org.junit.Test 
    public void testAmdahlShouldReturnFivehundererd()
    {
        int aantalProcessoren = 1000;
        double sequentialPrecentage = 0.001;
        double expected = 500;
        double actual = Amdahl.calculateSpeedUp(aantalProcessoren, sequentialPrecentage);
        assertEquals(expected, actual, 1); 
    }
    
    @org.junit.Test
    public void testAmdahlShouldReturnZero()
    {
        double sequentialPrecentage = 0.001;
        
        double testProcessorZero = Amdahl.calculateSpeedUp(0, sequentialPrecentage);
        double testProcessorMinus = Amdahl.calculateSpeedUp(-1, sequentialPrecentage);
        //Tests
        assertEquals(0, testProcessorZero, 1);
        assertEquals(0, testProcessorMinus, 1); 
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AmdahlTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()    
    {
        assertTrue( true );
    }
}
