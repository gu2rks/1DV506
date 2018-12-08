package aa224iu_lab3;

import java.util.Scanner;

public class Pnr {
	public static void main(String[] agr) {

		// personnummer
		Scanner scan = new Scanner(System.in);
		System.out.print("Mata in personnummer som du vill kolla upp (ÅÅMMDD-NNNN): ");
		String personnr = scan.nextLine();

		// ÅÅMMDD
		System.out.println("ÅÅMMDD : " + getFirstPart(personnr));

		// NNNN
		System.out.println("NNNN : " + getSecondPart(personnr));

		// Female
		System.out.println("Kvinna : " + isFemaleNumber(personnr));

		// male
		System.out.println("Man  : " + isMaleNumber(personnr));

		// areEqual
		String test2 = "640123-8822"; // skriva personnumeret som du vill kolla
		System.out.println("Samma personnummer :" + areEqual(personnr, test2));

		// is correct
		// clear
		clearAndPutIn(personnr);
		// räknar ut tal som står i jämmna läge
		evenPosition(clearAndPutIn(personnr));
		// räknar ut tal som står i udda läge
		oddPosition(clearAndPutIn(personnr));
		// räknar ut den rätta sista talet
		last(evenPosition(clearAndPutIn(personnr)), oddPosition(clearAndPutIn(personnr)));

		System.out.println("Är " + personnr + " rätt personnummer ?");
		// kolla om personnumeret är rätt
		System.out.println("Svar : " + isCorrect(personnr,
				(last(evenPosition(clearAndPutIn(personnr)), oddPosition(clearAndPutIn(personnr))))));

		scan.close();
	}

	// ÅÅMMDD
	private static String getFirstPart(String x) {

		// split by spaces
		String firstPart = x.substring(0, 6);
		return firstPart;
	}

	private static String getSecondPart(String x) {

		String secondPart = x.substring(7, 11);
		return secondPart;

	}

	// female = even
	private static boolean isFemaleNumber(String x) {
		String sex = x.substring(9, 10);
		int female = Integer.parseInt(sex);
		if (female % 2 == 0) {
			return true;
		}
		return false;
	}

	// male = odd
	private static boolean isMaleNumber(String x) {
		String sex = x.substring(9, 10);

		int male = Integer.parseInt(sex);
		if (male % 2 != 0) {
			return true;
		}
		return false;
	}

	// equal
	private static boolean areEqual(String x, String y) {
		x = x.replaceAll("[^0-9]", "");
		y = y.replaceAll("[^0-9]", "");

		for (int i = 0; i <= x.length() - 1; i++) {
			char first = x.charAt(i);
			char second = y.charAt(i);

			if (first != second) {
				return false;
			}

		}
		return true;
	}

	/* isCorrect */

	// clear and put in
	// den här metod är lite onödigt men jag orkar inte fixa om hela
	private static int[] clearAndPutIn(String x) {
		x = x.replaceAll("[^0-9]", "");
		x = x.substring(0, 9);
		String[] split = x.split("");

		int[] arr = new int[split.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(split[i]);

		}

		return arr;
	}

	// even
	private static String evenPosition(int[] arr) {
		// räknar ut talet som ligger i Arry på jämna positon
		int[] newArr = new int[5]; // 4 jämna position + 1-[0]

		for (int i = 0; i < 5; i++) {
			int n = 2 * i;
			newArr[i] = arr[n] * 2;
		}

		String temp = "";

		for (int i = 0; i < 5; i++) // gör till string
			temp += newArr[i];

		return temp; // string jämna position
	}

	// odd
	private static String oddPosition(int[] arr) {
		int[] newArr = new int[5];

		for (int i = 1; i <= 4; i++) { // udda läge
			int n = (2 * i) - 1;
			newArr[i] = arr[n];
		}

		String temp = "";

		for (int i = 1; i < 5; i++) // gör till string
			temp += newArr[i];

		return temp; // String av udda läge
	}

	// räknar ut den rätta sista talet i personnummer
	private static int last(String x, String y) {
		String temp = x + y;
		String[] split = temp.split("");

		int[] arr = new int[split.length];
		// splita och läga string i array
		for (int i = 0; i < arr.length; i++)
			arr[i] = Integer.parseInt(split[i]);

		// summan
		int summan = 0;
		for (int i = 0; i < arr.length; i++) {
			summan = summan + arr[i];

		}

		int last = (10 - (summan % 10)) % 10; // 6

		return last; // den rätta sista talet

	}

	private static boolean isCorrect(String person, int x) {
		String last = person.substring(10, 11);
		String mm = person.substring(2, 4);
		String dd = person.substring(4, 6);
		String years = person.substring(0, 3);

		// String => int
		int month = Integer.parseInt(mm);
		int day = Integer.parseInt(dd);
		int y = Integer.parseInt(last);
		int year = Integer.parseInt(years);

		switch (mm) {
		case "01":
		case "03":
		case "05":
		case "07":
		case "08":
		case "10":
		case "12":
			if (day > 31)
				return false;
			break;

		case "02":
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)) && (day > 29))
				return false;
			break;

		default:
			if (day > 30)
				return false;
			break;

		}
		if ((y == x) && (month <= 12) && (day <= 31))
			return true;
		// när sista talet är rätt+månader<12 och dagtum <31

		return false;
	}

}
