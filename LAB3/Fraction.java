package aa224iu_lab3;

public class Fraction {

	private int t;
	private int n;

	public Fraction(int nyT, int nyN) {
		if (nyN == 0) {
			System.out.println("ERROR 404...");
		} else {
			t = nyT;
			n = nyN;
		}
	}

	public String getNumerator() {
		String nummertor = "Numerator = " + t;
		return nummertor;
	}

	public String getDenominator() {
		String denominator = "Denominator = " + n;
		return denominator;
	}

	public boolean isNegative() {
		if ((t < 0) || (n < 0)) {
			return true;
		} else
			return false;
	}

	public boolean isEqualTo(Fraction nf2) {
		return nf2.t == t && nf2.n == n;
	}

	public String toString() {
		String show = "" + t + "/" + n;
		return show;
	}

	public Fraction add(Fraction nf2) {
		int newT = (t * nf2.n) + (nf2.t * n);
		int newN = n * nf2.n;

		if (newN == 0) {
			Fraction TNadd = new Fraction(0, 0);
			return TNadd;
		}

		if (newN == newT) { // n/n = 1
			Fraction TNadd = new Fraction(1, 1);
			return TNadd;
		}

		else {
			// Euklides algoritm
			int tempN = newN;
			int tempT = newT;

			while (tempN != 0) {
				int resten = tempT % tempN;
				tempT = tempN;
				tempN = resten;
			}

			int realN = newN / tempT;
			int realT = newT / tempT;

			Fraction TNadd = new Fraction(realT, realN);
			return TNadd;
		}

	}

	public Fraction subtract(Fraction nf2) {
		int newT = (t * nf2.n) - (nf2.t * n);
		int newN = n * nf2.n;

		if (newN == 0) {
			Fraction TNsub = new Fraction(0, 0);
			return TNsub;
		}

		if (newN == newT) { // n/n = 1
			Fraction TNsub = new Fraction(1, 1);
			return TNsub;
		}

		else {
			int tempN = newN;
			int tempT = newT;

			while (tempN != 0) {
				int resten = tempT % tempN;
				tempT = tempN;
				tempN = resten;
			}

			int realN = newN / tempT;
			int realT = newT / tempT;

			Fraction TNsub = new Fraction(realT, realN);
			return TNsub;
		}

	}

	public Fraction multiply(Fraction nf2) {
		int newN = n * nf2.n;
		int newT = t * nf2.t;

		if (newN == 0) {
			Fraction TNmulti = new Fraction(0, 0);
			return TNmulti;
		}

		if (newN == newT) { // n/n = 1
			Fraction TNmulti = new Fraction(1, 1);
			return TNmulti;
		}

		else {

			int tempN = newN;
			int tempT = newT;

			while (tempN != 0) {
				int resten = tempT % tempN;
				tempT = tempN;
				tempN = resten;
			}

			int realN = newN / tempT;
			int realT = newT / tempT;

			Fraction TNmulti = new Fraction(realT, realN);
			return TNmulti;
		}

	}

	public Fraction divide(Fraction nf2) {
		int newN = n * nf2.t;
		int newT = t * nf2.n;

		if (newN == 0) {
			Fraction TNdivi = new Fraction(0, 0);
			return TNdivi;
		}

		if (newN == newT) { // n/n = 1
			Fraction TNdivi = new Fraction(1, 1);
			return TNdivi;
		}

		else {

			int tempN = newN;
			int tempT = newT;

			while (tempN != 0) {
				int resten = tempT % tempN;
				tempT = tempN;
				tempN = resten;
			}

			int realN = newN / tempT;
			int realT = newT / tempT;

			Fraction TNdivi = new Fraction(realT, realN);
			return TNdivi;
		}

	}

}
