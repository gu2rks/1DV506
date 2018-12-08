package aa224iu_lab3;

import java.util.Scanner;

public class MultiDisplayMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Mata in text : ");

		MultiDisplay md = new MultiDisplay();

		md.setDisplayMessage(sc.nextLine());

		System.out.print("Antal upprepningar : ");
		md.setDisplayCount(sc.nextInt());

		md.display(); // ==> print-out

		md.display("Goodbye cruel world!", 2); // ==> print-out

		System.out.println("Current Message: " + md.getDisplayMessage());
		sc.close();
	}
}
