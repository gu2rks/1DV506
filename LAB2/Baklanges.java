package aa224iu_lab2;

import java.util.Scanner;

public class Baklanges {
	public static void main(String[]args) {
		//scan
		Scanner scan = new Scanner(System.in);
		System.out.print("Mata in en textrad: ");		
		String text = scan.nextLine();
		int langd = text.length();	
	
		String rev = ""; //just a string
		
		
		for (int i = langd-1; i >= 0; i--) { //reverse
			char c = text.charAt(i);
			rev = rev + c;
									
			}
		//print
		System.out.print("Baklänges : "+rev); 
		scan.close();
		}
	
}


