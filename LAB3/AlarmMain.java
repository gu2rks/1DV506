package aa224iu_lab3;



public class AlarmMain {
	
	public static void main(String[] args) {

		AlarmClock nac = new AlarmClock(23, 48); //23:48		
		nac.displayTime();
		
		nac.setAlarm (6 , 15);	//6:15		
		nac.displayAlarmTime();
		
		//500 min
		for(int i = 0; i <=500 ;i++) {
			nac.timeTick();
		}
		
		nac.displayTime();
	}
}
