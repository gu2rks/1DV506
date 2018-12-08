package aa224iu_lab3;

public class AlarmClock {
	/* Current time */
	private int hours = 0;
	private int minutes = 0;
	/* Alarm Properties */
	private int alarmHour = 0;
	private int alarmMinute = 0;
	private boolean alarmOn = false;

	public AlarmClock(int h, int m) { // starta klockan
		hours = h;
		minutes = m;
	}

	public void displayTime() { // show
		System.out.println("Time: " + hours + " hours, " + minutes + " minutes");
	}

	public void setAlarm(int h, int m) { // väcka
		alarmHour = h;
		alarmMinute = m;
		alarmOn = true;
	}

	public void displayAlarmTime() { // show
		System.out.println("Alarm Time: " + alarmHour + " hours, " + alarmMinute + " minutes");
	}

	public void timeTick() {
		minutes = minutes + 1;

		if (minutes == 60) {
			hours = hours + 1;
			minutes = 0;
		}

		if (hours == 24) {
			hours = 0;
		}

		checkAlarm();
	}

	private void checkAlarm() {
		if (alarmOn && minutes == alarmMinute && hours == alarmHour)
			System.out.println("Wake up! Time to go!");
	}
}
