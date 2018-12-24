package aa224iu_lab4.Sorter_orter;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SorteraOrter {

	public static void main(String[] args) throws IOException {

		try {
			dela(args[0]);
			System.out.println("Läser orter från filen: " + args[0]);
			System.out.println("Antal funna orter: " + count);

			Ort[] x = new Ort[count];

			for (int i = 0; i < count; i++) {
				x[i] = orter.get(i);
			}
			Arrays.sort(x);

			for (Ort element : x) {
				System.out.println(element);
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	private static int count;
	private static int postnr;
	private static String ort;
	private static ArrayList<Ort> orter = new ArrayList<Ort>();

	public static void dela(String x) throws IOException {
		File file = new File(x);
		Scanner sc = new Scanner(file);

		while (sc.hasNext()) {
			count++;
			String[] split = sc.nextLine().split(";"); // split
			ort = split[1];
			String nr = split[0];
			postnr = Integer.parseInt(nr);

			orter.add(new Ort(postnr, ort));

		}
		sc.close();
	}

}
