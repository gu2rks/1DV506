package aa224iu_lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class OmvandOrdning {
	public static void main(String[]args) {
		
		System.out.print("Enter positive integers. End by giving a negative integer.\n");
		ArrayList<Integer> number = new ArrayList<Integer>(); //Make Array list
		//Scanner		
		Scanner sc = new Scanner(System.in);
		boolean doIt = true;
		int c = 0; //count
		
		
		//loop
		while(doIt) {
		c++;
		System.out.print("Integer "+c+": ");
		int numX = sc.nextInt();
		number.add(numX);
			if ( numX < 0) { 
				doIt = !doIt;	//End loop
			}
		}
		
			
		//print
		System.out.print("Number of positive integers: "+(c-1)+"\n"); 
		
		//reverse		
		for ( int i= number.size()-2; i >=0; i--) {	
			System.out.print(number.get(i)+", ");
		}
		
		
		
		sc.close();
	}

}
