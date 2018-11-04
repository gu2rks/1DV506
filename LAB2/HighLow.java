package aa224iu_lab2;

import java.util.Random;
import java.util.Scanner;

public class HighLow {
	public static void main (String[]agrs) {
		//Random
		Random rand = new Random();		
		int talX = 1+rand.nextInt(100); //pick random numbers from 1-100
		int guess = 0;
		
		
		
		for ( int i = 0; i < 11 ; i++) { //loop		
				
				guess++; //count
				
						if ( guess == 11 ) { //game over
							System.err.print("LMAO!!! GAME OVER BRO!!!");
							System.exit(-1);;
						}
						
				//scanner		
				Scanner scan = new Scanner(System.in); 
				System.out.print("Guess "+(guess)+":");	
				int n = scan.nextInt();
				
				if (guess <= 9) {		//I added it coz i want to
				if (guess == 9) { 		//last chance
					System.out.println("THIS IS YOUR LAST CHANCE");}
				else {	
					System.out.println("You have "+(10-guess)+" chance left.");
				
				}
				}
				
						
				
				if ( talX == n){ //excellent			
					System.out.print("Correct answer after only "+guess+" guesses - Excellent!");
					System.exit(-1);
				}
				
				
		
				else if (talX > n) { //higher
					System.out.println("Clue: higher!");
					
				}
				else if ( talX < n) { //lower
						System.out.println("Clue: lower!");
					
				}
				
				else {
					scan.close();
				}
		
		}
		
		
	
		
		
	}
	

}	
	
		

		
	

