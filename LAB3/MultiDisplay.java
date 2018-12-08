package aa224iu_lab3;

public class MultiDisplay {

	private String displayMessage; // massage
	private int displayCount; // how many time

	public MultiDisplay() {
		displayMessage = "";
		displayCount = 0;
	}

	public MultiDisplay(String msg, int count) {
		displayMessage = msg;
		displayCount = count;
	}

	// get
	public String getDisplayMessage() {
		return displayMessage;
	}

	public int getDisplayCount() {
		return displayCount;
	}

	// set
	public void setDisplayMessage(String msg) {
		displayMessage = msg;
	}

	public void setDisplayCount(int count) {
		displayCount = count;
	}

	// print
	public void display() {

		for (int i = 0; i < displayCount; i++) {
			System.out.println(displayMessage);
		}
	}

	public void display(String msg, int count) {
		displayCount = count;
		displayMessage = msg;
		for (int i = 0; i < displayCount; i++) {
			System.out.println(displayMessage);
		}
	}

}
