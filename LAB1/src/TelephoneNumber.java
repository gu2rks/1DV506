package aa224iu_lab1;

import java.util.Random;

public class TelefonNummer {
	public static void main(String[]args) {
		
		Random rand = new Random();
		int talX = rand.nextInt(1000); //talx
		Integer.toString(talX);
	
		int talZ = 1+rand.nextInt(9); //talz
		int talY = rand.nextInt(100000); //taly

		
		
		System.out.printf("Telefonnummer: 0%03d-%d%05d",talX,talZ
				,talY);
		
	
	
		
	}
}
