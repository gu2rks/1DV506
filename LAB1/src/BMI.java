package aa224iu_lab1;

import java.util.Scanner;

public class BMI {
	public static void main (String[]args) {
	//scanner
	Scanner scan = new Scanner(System.in); 	
	System.out.print("Ange din längd i meter:");
	double langd = scan.nextDouble(); //sparat
	System.out.print("Ange din vikt i kilogram:");
	double vikt = scan.nextDouble(); //sparat
	
	
	
	//resultat
	System.out.print("Ditt BMU är:"+ Math.round((vikt/(langd*langd)))); /* eller vikt / Math.pow(lagnd , 2)*/
	
	scan.close();
	

	}
	
}