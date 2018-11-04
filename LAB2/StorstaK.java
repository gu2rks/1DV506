package aa224iu_lab2;

import java.util.Scanner;

public class StorstaK {
	
	public static void main(String[]args) {
		//scanner
		Scanner scan = new Scanner(System.in);
		System.out.print("Give a positive integer: ");
		int scanner = scan.nextInt();
		scan.close();				
		int sum = 0 , n = 0 , c = 0;		
		
		
		if (scanner >= 0)
				//loop		
				while (scanner >= sum) {
						c++; 				//how many time
						n = c * 2; 			//increase 2 every time
						sum = sum + n;		//the next n 
					}
		
		else { //scanner <=0
			System.err.println("Really?... A POSITIVIE INTEGER BRO!");	
			System.exit(-1);	
		}	
		
	
	System.out.print("The largest K such that 0+2+4+6+...+K < "+scanner+" => "+"K="+(n-2));
	//n-2 coz the loop is until scanner >= sum
	
	}
}


