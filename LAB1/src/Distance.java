package aa224iu_lab1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Avstand {
	public static void main (String[]args) {
		//scanner
		Scanner scan = new Scanner(System.in);
		//första koordinat
		System.out.print("Ange första koordinat i fromen x,y: ");
		String input = scan.nextLine();    // get the entire line after the prompt 
		String[] numbers = input.split(","); // split by spaces
		String xEtt = numbers[0];	//första tal = x1
		String yEtt = numbers[1];	//andra tal = y1
		
		//String--->double
		Double x1 = Double.parseDouble(xEtt); 	
		Double y1 = Double.parseDouble(yEtt);
		
		//andra koordinat
		System.out.print("Ange andra koordinat i fromen x,y: ");
		String inputTva = scan.nextLine();    // get the entire line after the prompt 
		String[] numberTva = inputTva.split(","); // split by spaces
		String xTvå = numberTva[0]; 	//fösta tal = x2
		String yTvå = numberTva[1];		//andra tal = y2	
		//String--->double
		Double x2 = Double.parseDouble(xTvå);
		Double y2 = Double.parseDouble(yTvå);
	
		
		//räkningen		
		double x = Math.pow((x1 - x2), 2);
		double y = Math.pow((y1 - y2), 2);
		double avstand = Math.sqrt((x+y));
	
		//avrunda till tre decimals noggrannhet
		DecimalFormat av = new DecimalFormat("0.###");
		String treSiffor = av.format(avstand);
		
	System.out.println("Avstånd: "+treSiffor);
	
	scan.close();
		
	}
}
