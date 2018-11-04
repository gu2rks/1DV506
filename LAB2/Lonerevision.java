package aa224iu_lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lonerevision {
	public static void main(String[]args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>(); //Make Array list
		
		
		//scanner
		Scanner sc = new Scanner(System.in);
		System.out.print("Provide salaries (and terminate input with 'X') :");
		
		
		//put in array
			while (sc.hasNextInt()) {
			    int salary  = sc.nextInt();
			    list.add(salary);	
			    	if (salary == 'X') { //break
			    		break;
			    	}
			}
		sc.close(); //close it here coz i dont need scanner anymore	
			
				
		
		//sort
			Collections.sort(list);
			
		
			
		//Median
			if(list.size() % 2 != 0) {	//even
				System.out.println("Median : "+list.get(list.size()/2));
			}
			else { //odd
				int a = list.get( (list.size() / 2) - 1);
				int b = list.get( (list.size( )/ 2));
				int median = (a + b) / 2;
				System.out.println("Median : "+median);
				
			}
		
		
			
		//Average
			int getSalary = 0, sum = 0, average = 0, count = 0;
					for (int i = 0; i <= list.size()-1; i++) { //loop
						count++;
						getSalary = list.get(i);
						sum += getSalary;
						average = sum/count;
					}		
			System.out.println("Average : "+average); //print
		
		
		
			
		//Gap
			int last = list.get(list.size()-1);		
				System.out.println("Gap : "+(last-list.get(0)) );
		
		
	}
}
	
