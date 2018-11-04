package aa224iu_lab2;

import java.util.Scanner;

public class Triangle {
	public static void main (String[]agrs) {
		
		//scanner
		Scanner scan = new Scanner(System.in);
		System.out.print("Provide an odd positive integer: ");
		int n = scan.nextInt();
		int x = 0 ;
				
			
		//Even
		if ( n % 2 == 0) { 
						System.err.print("Really?... an ODD positive an odd positive");
						System.exit(-1);
					}
			
						
			
		//ODD = JUST DO IT
		else {	
								
				System.out.println("Right-Angled Triangle:" );	
									
				//Right-Angled Triangle	
				for(int i = 1; i <= n ; i++) {	
						for(int tomt = n - 1; tomt >= i; tomt--) {	//empty space, backward
								System.out.print(" ");
						}
						for(int star = 1; star <= i; star++) {	//put star after empty space		
								System.out.print("*");	
						}
				
						System.out.println(); //jump to next line				
				}
	
	
				//space between triangle
				System.out.println();	
				System.out.println();
	
	
				//Isosceles Triangle
				System.out.println("Isosceles Triangle:");
				for(int i = 1; i <= n ; i +=2) {
					x++;
		
						for(int tomt = n/2; tomt >= x; tomt--) {	//empty space 
							System.out.print(" ");
						}
						for(int star = 1; star <= i; star++) {	//put star after empty space
							System.out.print("*");	
						}
						
					System.out.println();
				}
	}
	scan.close();
	}

}
