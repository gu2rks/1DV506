package aa224iu_lab2;

import java.util.Scanner;

public class RaknaSiffror {
	public static void main (String[]agrs) {
		//Scanner
		Scanner scan = new Scanner(System.in);
		System.out.print("Provide a positive integer: ");
		int x = scan.nextInt();	
		//convert to string
		String numberX = Integer.toString(x);
		
		int zero = 0, odd = 0, even = 0;		
		//loop
		for( int i = 0; i < numberX.length(); i++ ) { 
			int numAt = numberX.charAt(i);
			
			
			if( numAt == '0') { //ZEROS
				zero++;			
				}
			else if ( numAt % 2 == 0 ) { //EVEN
					even++;
				}
			else if ( numAt % 2 != 0) { //ODD
					odd++;
				}
		
	}
	System.out.println("Zeros: "+zero);
	System.out.println("Even: "+even);
	System.out.println("Odd: "+odd);
	scan.close();
}
}
