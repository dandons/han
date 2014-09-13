package amdahl;

public abstract class Amdahl {	
	
	/**
	 * @description Dit is de formulier van Amdahl, de formulier berekent de "Speed Up factor"
	 * @link http://en.wikipedia.org/wiki/Amdahl's_law
	 * @param aantalProcessoren
	 * @param sequentialPrecentage 1.0 = 100% | 0.5 = 50% | 0.0 = 0%
	 * @return speed up factor in double
	 * @author Oefening Amdahl week 2 DOA by Daniel Donselaar
	 */
	public static double calculateSpeedUp(int aantalProcessoren, double sequentialPrecentage){
		if(aantalProcessoren <= 0){ 						// Controle of er meer dan 1 processor is.
			aantalProcessoren = 1;
		}
		if(sequentialPrecentage < 0){						// Controle of de percentage minder is dan 0%
			sequentialPrecentage = 0;
		}
		if(sequentialPrecentage > 1){						// Controle of de percentage meer is dan 100%
			sequentialPrecentage = 1;
		}
		return aantalProcessoren / (1 + sequentialPrecentage*(aantalProcessoren - 1));
	}
	
	public static double calculateSequential(int aantalProcessoren, int speedUpFactor){
		if(aantalProcessoren <= 0){ 						// Controle of er meer dan 1 processor is.
			aantalProcessoren = 1;
		}
		double N = aantalProcessoren;
		double S = speedUpFactor;

		return (((N / (N - 1))-1)/S);
	}
	
	public static double calculateEfficiency(int aantalProcessoren, double speedUpFactor){
		return speedUpFactor/aantalProcessoren;
	}
	
	
	
}
