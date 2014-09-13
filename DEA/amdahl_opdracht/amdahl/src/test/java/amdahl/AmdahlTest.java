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
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AmdahlTest( String speedUp )
    {
        super( speedUp );
        int aantalProcessoren = 1000;
        double sequentialPrecentage = 0.001;
        double expected = 500;
        double actual = Amdahl.calculateSpeedUp(aantalProcessoren, sequentialPrecentage);
        assertEquals(expected, actual, 1); 
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
