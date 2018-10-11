package aa224iu_lab1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Konvertera {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ange temperatur i Fahrenheit: ");
		double fahrenheit = scan.nextDouble();
		double celsius = (fahrenheit - 32) * 5 / 9;
		
		//avrunda till en decimals noggrannhet
		DecimalFormat celsiusFormat = new DecimalFormat("0.#");
		String oneDecimal = celsiusFormat.format(celsius);
		
		System.out.println("Celsius:"+oneDecimal);
		
		
		
		scan.close();
	}
}
