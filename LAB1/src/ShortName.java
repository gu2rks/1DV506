package aa224iu_lab1;

import java.util.Scanner;

public class KortNamn {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		//förnamn
		System.out.print("Förnamn: "); 
		String forNamn = scan.nextLine();
		
		//kort förnamn		
		char first = forNamn.charAt(0);
		
		//Efternamn		
		System.out.print("Efternamn: ");
		String efterNamn = scan.nextLine();
		/*ifall nån som har efternamn med två eller tre bokstäver
		*tror ej det finns någon som har efternam på en bokstav.
		 */
		String spaceBar = "  ";
		String efterNamnSB= efterNamn + spaceBar;
		
		//kort efternamn
		String sub = efterNamnSB.substring(0,4);
		
		System.out.print("Kort namn: "+first+". "+sub);
	
	scan.close();
			
	}
}
