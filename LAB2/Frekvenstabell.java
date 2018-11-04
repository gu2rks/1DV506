package aa224iu_lab2;


import java.util.Random;

public class Frekvenstabell {
	public static void  main (String[]args) {
		
		Random rand = new Random();
		int dice[] = new int [7]; //make array
		
		//rolling a dice 6000 times.
		for( int roll = 0; roll < 6000 ; roll++) { 
			/*random + put in Array.
			 * if 1 put in [1]. 2 put in [2] */
			++dice[1+rand.nextInt(6)];
		}
		
		//print
		System.out.println("Frequencies when rolling a dice 6000 times.");
		for(int i = 1; i < dice.length; i++) {
			System.out.println(i+" : "+dice[i]);
			
		}
}
}
