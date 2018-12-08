package aa224iu_lab3;

public class Point {
	private int x;
	private int y;

	public Point() {
		x = 0;
		y = 0;

	}

	public Point(int nyX, int nyY) {
		x = nyX;
		y = nyY;

	}

	public String toString() {
		String punkt = "(" + x + "," + y + ")";
		return punkt;
	}

	public boolean isEqualTo(Point p2) {
		return p2.x == x && p2.y == y;

	}

	public double distanceTo(Point p2) {
		double newX = Math.pow((x - p2.x), 2);
		double newY = Math.pow((x - p2.y), 2);
		double avstand = Math.round(Math.sqrt((newX + newY)));

		return avstand;
	}

	public void move(int nyX, int nyY) {
		x = x + nyX;
		y = y + nyY;
	}

	public void moveToXY(int nyX, int nyY) {
		x = nyX;
		y = nyY;
	}
}
