package aa224iu_lab4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Histogram {
	public static void main(String[] args) {

		try {
			readFile(args[0]);
			System.out.println("Läser heltal från filen: "+args[0]);
			System.out.println("Antal i intervallet [1,100]: " + countNum);
			System.out.println("Övriga: " + ovriga);
			// System.out.println(toString(tal));
			System.out.println(" 1  - 10  | " + histogram(0));
			System.out.println("11  - 20  | " + histogram(1));
			System.out.println("21  - 30  | " + histogram(2));
			System.out.println("31  - 40  | " + histogram(3));
			System.out.println("41  - 50  | " + histogram(4));
			System.out.println("51  - 60  | " + histogram(5));
			System.out.println("61  - 70  | " + histogram(6));
			System.out.println("71  - 80  | " + histogram(7));
			System.out.println("81  - 90  | " + histogram(8));
			System.out.println("91  - 100 | " + histogram(9));
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static int countNum = 0;
	private static int ovriga = 0;
	private static int[] tal = new int[10];

	public static void readFile(String x) throws IOException {
		File file = new File(x);
		Scanner sc = new Scanner(file);
		int ovrig = 0, count = 0;
		while (sc.hasNextInt()) {
			int scTal = sc.nextInt();
			if ((scTal > 100) || (scTal < 0)) 
				ovrig++;
			else {
				count++;
				int n = ((scTal - 1) / 10);
				tal[n]++;
			}

		}
		countNum = count;
		ovriga = ovrig;
		sc.close();

	}

	public static String histogram(int plats) throws IOException {
		String temp = "";
		for (int i = 0; i < tal[plats]; i++) {
			String star = "*";
			temp = temp + star;
		}
		return temp;
	}

}
