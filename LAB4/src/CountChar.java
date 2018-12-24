package aa224iu_lab4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CountChar {
	public static void main (String[]agrs) {
		
		try {
			count(agrs[0]);
			System.out.println("Antal stora bokstäver: "+big);
			System.out.println("Antal små bokstäver: "+small);
			System.out.println("Antal siffror: "+num);
			System.out.println("Antal \"whitespaces\":"+space);
			System.out.println("Antal övriga: "+etc);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private static int big;
	private static int small;
	private static int num;
	private static int space;
	private static int etc;
	
	private static void count(String x) throws IOException {
		File file = new File(x);
		Scanner sc = new Scanner(file);
		sc.useDelimiter("");
		while (sc.hasNext()) {
			 char c = sc.next().charAt(0); 
				
				if ( Character.isUpperCase(c) )
					big++;
				else if ( Character.isLowerCase(c) )
					small++;
				else if ( Character.isDigit(c))
					num++;
				else if ( Character.isWhitespace(c))
					space++;
				else 
					etc++;
				
				
			}
		sc.close();
		}
		
		
}
	