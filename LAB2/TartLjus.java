package aa224iu_lab2;

public class TartLjus {
	public static void main (String[]args) {
		
		int candles = 0, buyCandles = 0, manyCandles = 0;
		for(int i = 1 ; i <= 100 ; i++) { //i = years
						
			if (candles < i) { //not enough
				if ( i - candles < 24) {
					buyCandles = 1;
				}
				else { 
					if((i - candles) % 24 == 0) {
						buyCandles = ( i - candles) / 24;
					}
					else { // decimal
						buyCandles = ( i - candles) / 24 +1;
					}
				}
				candles = candles + buyCandles * 24 - i;
			}	
				
			else {	// u have candles left 
				buyCandles = 0;
				candles = candles - i; 
			}
			
			if( buyCandles !=0) { //when u buy more candles

				System.out.println("Before birthday "+i+", buy "+buyCandles+" bex(es)");				
			}
				
			
			manyCandles = manyCandles + buyCandles; // how many box of candles u bought
					
		}
		System.out.print("Total number of boxes: "+manyCandles+", Remaining candles:"+candles);
	}
}
