package aa224iu_lab1;

import java.util.Scanner;

public class SummaAvTre {
	static public void main(String[]arg) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ange ett tresiffrigt heltal:");
		int n = scan.nextInt();
		int st = n / 100; 
		int nd = (n % 100)/10 ; 
		int rd = n % 10;
		
		
	
	System.out.print("Summan av sifforna i heltalet är:"+(st+nd+rd));
		
		
		scan.close();
	}

}
