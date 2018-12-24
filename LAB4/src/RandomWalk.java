package aa224iu_lab4;

import java.util.Random;

public class RandomWalk {

	private int x = 0;
	private int y = 0;
	private int max;
	private int count = 0;
	private int storlek;

	public RandomWalk(int max, int size) {
		this.max = max;
		storlek = size;
	}

	public String toString() {
		return "Antal steg :" + count + " Nuvarande position :" + x + "," + y;
	}

	public void takeStep() {

		Random r = new Random();
		int riktning = r.nextInt(4);

		if (riktning == 0)
			y++;
		if (riktning == 1)
			y--;
		if (riktning == 2)
			x++;
		if (riktning == 3)
			x--;
		count++;

	}

	public boolean moreSteps() {
		return count < max;
	}

	public boolean inBounds() {
		return ((x < storlek) && (y < storlek) && (x > -storlek) && (y > -storlek));
	}

	public void walk() {
		while (moreSteps() && inBounds())
			takeStep();

	}

}
