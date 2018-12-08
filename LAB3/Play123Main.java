package aa224iu_lab3;

public class Play123Main {

	public static void main(String[] args) {

		double vinner = 0;
		for (int i = 0; i < 10000; i++) {
			Deck deck = new Deck();
			if (play123(deck) == true) {
				vinner++;
			}

		}

		System.out.println(((vinner * 100) / 10000) + "%");

	}

	public static boolean play123(Deck deck) {

		deck.shuffle();
		int cout = 0;
		for (int i = 0; i < 52; i++) {

			deck.delarKort();
			// 0 = ace, 1 = 2, 2 = 3
			if (cout == 3) {
				cout = 0;
			}

			if (cout == deck.getRanks()) {
				return false;
			}
			cout++;
		}
		return true;
	}

}