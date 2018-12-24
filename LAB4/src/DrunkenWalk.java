package aa224iu_lab4;

import java.util.Scanner;

public class DrunkenWalk {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Ange storlek: ");
		int storlek = sc.nextInt();
		
		System.out.print("Ange max antal steg: ");
		int max = sc.nextInt();

		System.out.print("Ange antal slumpvandringar: ");
		int loop = sc.nextInt();
		int count = 0;
		for (int i = 0; i < loop; i++) {
			RandomWalk rw = new RandomWalk(max, storlek);
			while (rw.moreSteps()) {
				rw.takeStep();
				if (!rw.inBounds()) {
					count++;
					break;
				}
			}
		}
		
		System.out.println(
				"Av " + loop + " onyktra personer, föll " + count + " (" + Math.round((count * 100) / loop) + "%) i vattnet.");

		sc.close();
	}
}
