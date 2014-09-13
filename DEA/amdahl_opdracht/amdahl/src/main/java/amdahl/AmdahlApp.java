package amdahl;

public class AmdahlApp 
{
    public static void main( String[] args )
    {
        /*
         * Oefening 1
         */
    	//System.out.println(Amdahl.calculateSpeedUp(1000, 0.001)); 
    	
    	/*
    	 * Oefening 2
    	 */
    	//A
        double sequential = Amdahl.calculateSequential(4, 3);
        System.out.println("Berekening Amdahl");
        
        //B
        double SpeedUp4 = Amdahl.calculateSpeedUp(4, sequential);
        double SpeedUp8 = Amdahl.calculateSpeedUp(8, sequential);
        double SpeedUp16 = Amdahl.calculateSpeedUp(16, sequential);
        double SpeedUp64 = Amdahl.calculateSpeedUp(64, sequential);
        
        //C
        System.out.println("4 Processoren: "+Amdahl.calculateEfficiency(4, SpeedUp4)+" Effeciency");
        System.out.println("8 Processoren: "+Amdahl.calculateEfficiency(8, SpeedUp8)+" Effeciency");
        System.out.println("16 Processoren: "+Amdahl.calculateEfficiency(16, SpeedUp16)+" Effeciency");
        System.out.println("64 Processoren: "+Amdahl.calculateEfficiency(64, SpeedUp64)+" Effeciency");
        
    }
}
