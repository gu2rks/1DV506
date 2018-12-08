package aa224iu_lab3;

public class Card {
	public enum Symbol {
		DIAMONDS, CLUBS, HEARTS, SPADES;
	}

	public enum Ranks {
		Ace, two, three, four, five, six, seven, eight, nine, ten, Jack, Queen, King;
	}

	private final Ranks valor;
	private final Symbol symbol;

	public Card(Ranks valor, Symbol symbol) { //Card
		this.valor = valor;
		this.symbol = symbol;
	}

	public Ranks getValor() { //get valör för play123
		return valor;
	}

	public String toString() { //print
		String x = valor + " of " + symbol;
		return x;
	}

}
