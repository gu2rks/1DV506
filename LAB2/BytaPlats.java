package aa224iu_lab2;

public class BytaPlats {
	public static void main (String[]args) {
		
		char[] text = { 't', 't', 'ä', 'l', ' ', 'r', 'a', 'v', ' ', 'a', 
     			't', 't', 'e', 'D' }; //Array
		
		//before
		System.out.printf("All items : ");			
		for( char x : text) {			
			System.out.print("\""+x+"\""+" ");
		}
		
		//shifting place		
			for (int i = 0; i <=7; i++) {
				char temp = text[i];				
				text[i] = text[(13-i)];
				text[(13-i)] = temp;
				
				}
			
		//after	
			System.out.printf("\n  Reverse : ");	
			for( char x : text) {			
				System.out.print("\""+x+"\""+" ");
			}
		

		
	}
}
