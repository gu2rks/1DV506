package aa224iu_lab2;

import java.util.Scanner;

public class Palindrom {
	public static void main (String[]agrs) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("GIVE ME A TEXT: ");
		String text = scan.nextLine();
		
		
		//take everything except a-z and A-Z
		text = text.replaceAll("[^a-zA-Z]","");
		scan.close();		
		System.out.println("Take out all numbers and another sh*t: "+text); //coz i want to show u
		
		
		char first = 0 , firstLow = 0, last = 0, lastLow = 0;
		//look at string to middle
		for (int i = 0; i < text.length()/2 ; i++) { 
			first = text.charAt(i); 
			last = text.charAt((text.length()-1)-i);
			
			if (Character.isUpperCase(first)) { //make to low
				firstLow = Character.toLowerCase(first);
				first = firstLow;
				
			}
			if (Character.isUpperCase(last)) { //make to low
				lastLow = Character.toLowerCase(last);
				last = lastLow;
				
			}
			
			if (first != last) { //Not a polindrom
				System.err.print("NOPE!! THE TEXT IS NOT A PALINDROM!!");
				System.exit(-1);
			}
									
			}
			
		//print 	
		System.out.print("YEAH!! THE TEXT IS  A PALINDROM!!");	
		
		
		}	
			

}
		
		
	


