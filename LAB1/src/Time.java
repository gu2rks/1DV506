package aa224iu_lab1;

import java.util.Scanner;

public class Tid {
	public static void main (String[]args) {
		Scanner scan = new Scanner(System.in);  	//scanner
		System.out.print("Ange antal sekunder:");

		int n = scan.nextInt(); 
		int timmar = n / 3600; 			//timmar
		int minuter = (n % 3600)/60;	//minuter
		int sek = (n % 3600) % 60;		//sekunder
		
	System.out.println("Detta motsvarar:"+timmar+"timmar, "+ minuter+" minuter"
			+ "och "+sek+" sekunder.");
	scan.close();	
	}
}
