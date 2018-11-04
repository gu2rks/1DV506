package aa224iu_lab2;

import java.util.Scanner;

public class RaknaA {
	public static void main (String[]args) {
		//scanner
		Scanner scan = new Scanner(System.in);
		System.out.print("Mata in en textrad: ");
		String text = scan.nextLine();		
				
		
		int na = 0, nA = 0; 	
		for( int i = 0; i < text.length(); i++ ) {	//loop to look at every character		
			char c = text.charAt(i); 
			
			if ( c == 'a') { //count a
				na++;							
				}
			else if( c == 'A') { //cout A
				nA++;
							}
				
		}
		
		//print
		System.out.println("Antal a: "+na);	
		System.out.println("Antal A: "+nA);
		scan.close();
		
	}
}
