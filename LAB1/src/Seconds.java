package aa224iu_lab1;

import java.util.Scanner;

public class Sekunder {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in); //Scanna
		System.out.print("Timmar:");
		int timSek = 3600; 		//rakningen(timme)
		timSek = timSek * scan.nextInt();
		System.out.print("Minuter:");	
		int minSek = 60; //rakningen(min)
		minSek = minSek * scan.nextInt();
		System.out.print("Sekunder:");
		int sek = scan.nextInt(); //sek
				
		//resultat 
		System.out.print("Totala antalet sekunder: "+(timSek+minSek+sek));
		
		scan.close();
				
	}

}
