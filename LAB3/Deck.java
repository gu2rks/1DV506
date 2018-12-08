package aa224iu_lab3;

import java.util.ArrayList;
import java.util.Collections;

import aa224iu_lab3.Card.Ranks;
import aa224iu_lab3.Card.Symbol;

public class Deck {

	private int kvar = 52;
	private int delat = 0;

	private ArrayList<Card> cards = new ArrayList<Card>();

	public Deck() { // make a deck
		for (Symbol symbol : Symbol.values()) {
			for (Ranks valor : Ranks.values()) {
				cards.add(new Card(valor, symbol));
			}
		}
	}

	public void shuffle() {
		if (kvar == 52)
			Collections.shuffle(cards);

		else
			System.out.println("U can't shuffle card now");
	}

	public void delarKort() {
		kvar--;
		delat++;
	}

	public void delatKort() {
		if (delat > 52) { // om nån mata in 52+
			System.out.println("it is only 52 cards in a deck");
			return;
		}

		if (kvar < 52) { // delar ut
			for (int i = 0; i < delat; i++) {
				System.out.println(cards.get(i).toString());
			}
		}

		if (kvar == 0) // när det inte finns kort kvar
			System.out.println("I dont have anycard left");

		else // hur många det finns kvar
			System.out.println("U have " + kvar + " cards left");

	}

	public int getRanks() { // tog fucking 3 timmar att hitta info på nätet
		return cards.get(delat - 1).getValor().ordinal();
		// .get(delat-1) = Arrrlist[delat-1]
		// .getValor() = hämta rank
		// .ordinal = printa ut den position av valor i enum list
		// .get och .ordinal. måste komma ihåg dom!!

	}
}