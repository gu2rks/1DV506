package aa224iu_lab4.Sorter_orter;

public class Ort implements Comparable<Ort> {

	private int post;
	private String ort;

	public Ort(int x, String y) {
		post = x;
		ort = y;
	}

	public String toString() {
		return post + " " + ort;

	}

	public int compareTo(Ort x) {
		return this.post - x.post;
	}
}
