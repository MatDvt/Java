package randomNumberGenerator;

import java.util.Random;

public class Run {

	public static void main(String[] args) {

		Random dice = new Random();
		int number; 
		
		for(int counter=1; counter<=6;counter++){
			
			number = 1+ dice.nextInt(50);
			System.out.println(number + " ");
		}
		
		
	}
}