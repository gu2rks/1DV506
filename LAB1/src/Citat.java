package aa224iu_lab1;

import java.util.Scanner;

public class Citat {
	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in); //tangentbordet
		
		System.out.print("Skriv in en rad text:"); //instruktion
		String text = scan.nextLine();  		// las in strang
		System.out.println("Citat: \""			
				+text+"\"" );				//printa stang
		
		scan.close();//koppla ned scennern
	}
}
