package aa224iu_lab3;

import java.util.Scanner;

public class DeckMain {
	public static void main(String[] args) {
		Deck nDeck = new Deck();
		nDeck.shuffle();

		Scanner sc = new Scanner(System.in);
		System.out.print("how many card u want to draw : ");
		int delarUt = sc.nextInt();

		// delar
		for (int i = 0; i < delarUt; i++) {
			nDeck.delarKort();
		}	

		nDeck.delatKort();

		sc.close();
	}
}
