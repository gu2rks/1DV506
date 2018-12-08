package aa224iu_lab3;

public class FractionMain {
	public static void main(String[] args) {

		Fraction nf1 = new Fraction(4, 5);
		Fraction nf2 = new Fraction(8, 4);

		System.out.println(nf1.getNumerator());
		System.out.println(nf1.getDenominator());

		System.out.println(nf1.isNegative());

		if (nf1.isEqualTo(nf2))
			System.out.println("The two fracktions are equal");

		System.out.println(nf1.toString());

		System.out.println("ADD : " + nf1.add(nf2));
		System.out.println("subtract : " + nf1.subtract(nf2));
		System.out.println("multiply : " + nf1.multiply(nf2));
		System.out.println("divide : " + nf1.divide(nf2));

	}

}
