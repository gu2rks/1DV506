package aa224iu_lab3;

public class Radio {
	private int volume;
	private int channel;
	private boolean onOff = false;

	public String getSettings() {

		if (onOff != true) {
			channel = 1;
			volume = 1;
			String display = "On : " + onOff + ", Channel :" + channel + ", Volume :" + volume;
			return display;

		}

		else {
			String display = "On : " + onOff + ", Channel :" + channel + ", Volume :" + volume;
			return display;
		}

	}

	// Volume
	public void setVolume(int newVolume) { // måste vara mer än 0 eller mindre än 5

		if (onOff != true) { // radio = off
			System.out.println("Radio off ==> No adjustment possible");
		}

		if ((newVolume < 0) || (newVolume > 5)) {
			System.out.println("New volume not within range!");
		} else {
			volume = newVolume;
		}

	}

	// up
	public void volumeUp() {

		if (onOff != true) { // radio = off
			System.out.println("Radio off ==> No adjustment possible");
		}

		else {
			volume = volume + 1;
			if (volume > 5) { // störe än 5
				System.out.println("New volume not within range!");
				volume = 5;
			}
		}
	}

	// down
	public void volumeDown() {

		if (onOff != true) { // radio är off
			System.out.println("Radio off ==> No adjustment possible");
		}

		else { // on
			volume = volume - 1;

			if (volume < 0) { // om volume är mindre än 0
				System.out.println("New volume not within range!");
				volume = 0;
			}
		}

	}

	// channel
	public void setChannel(int newChannel) {

		if (onOff != true) { // radio = off
			System.out.println("Radio off ==> No adjustment possible");
		}

		if ((newChannel > 10) || (newChannel < 1)) {
			// måste vara mindre än 10 och större än 1
			System.out.println("New channel not within range!");
		}

		else {
			channel = newChannel;
		}
	}

	// up
	public void channelUp() {
		if (onOff != true) { // radio = off
			System.out.println("Radio off ==> No adjustment possible");
		}

		else {
			channel = channel + 1;
			if (channel > 10) { // större än 10
				System.out.println("New channel not within range!");
				channel = 10;
			}
		}

	}

	// down
	public void channelDown() {
		if (onOff != true) { // radio = off
			System.out.println("Radio off ==> No adjustment possible");
		}

		else {
			channel = channel - 1;
			if (channel < 1) {
				System.out.println("New channel not within range!");
				channel = 1;
			}
		}
	}

	// ON
	public void turnOn() { // on med default setting
		channel = 1;
		volume = 1;
		onOff = true;
	}

	// off
	public void turnOff() {

		onOff = false;
	}

}
