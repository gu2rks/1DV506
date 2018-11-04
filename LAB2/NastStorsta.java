package aa224iu_lab2;

import java.util.Scanner;

public class NastStorsta {
	public static void main (String[]args) {
		//scanner
		Scanner scan = new Scanner(System.in);
		System.out.print("Provide 10 integers: " );
		
		int Slargest = Integer.MIN_VALUE, storsta = Integer.MIN_VALUE;
		//loop
		for (int a = 0; a < 10 ; a++) { // 10 numbers
			int talX = scan.nextInt();
			
				if (a == 9) {
						scan.close();}
		    		
	    		if (talX > storsta) { //largest
	    				Slargest = storsta;
	    				storsta = talX;
	    				
	    				}
	    			
	    			else if (Slargest < talX) { //2nd largest
	    					Slargest = talX;	    				
	    				}
	    		if (Slargest == storsta) { //om man mata in samma tal
	    				System.out.print("YOU ARE NOT ALLOWED TO PUT SAME NUMBERS!!");
	    				return;
	    			}		
  		    	
	    				    
		}
		System.out.print("The second largest is: " +Slargest);
		
	}
	
}
