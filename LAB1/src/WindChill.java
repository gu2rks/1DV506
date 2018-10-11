package aa224iu_lab1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class VindAvkylning {
	public static void main(String[]args) {
	//scanner
	Scanner scan = new Scanner(System.in);
	//prompt
	System.out.print("Ange Temperatur (C): ");
	double temperatur = scan.nextDouble();
	System.out.print("Ange vind hastigheten (m/s); ");
	double vindMS = scan.nextDouble();
	
		

	// m/s--->k/h
	double vindHastighet = vindMS * 3.6;
	//Della twc i 3 olika dela (a,b,c)
	double a = 13.12 + 0.6215 * temperatur;
	double b = 11.37 * Math.pow(vindHastighet, 0.16);
	double c = 0.3965*temperatur*Math.pow(vindHastighet, 0.16);
	
	//avrunda till tre decimals noggrannhet
	DecimalFormat av = new DecimalFormat("0.#");
	String realFeel = av.format(a-b+c);
	
	System.out.print("Upplevd temperatur (C): "+realFeel);
	
	scan.close();
	
	}
}
