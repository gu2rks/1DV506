package aa224iu_lab4.stack;

import java.util.Iterator;

public class StackMain  {
	
	public static void main (String[]agrs) {
		Stack nStack = new LiFoStack();
		
				
		if(nStack.isEmpty()) 	//empty?
			System.out.println("Stack is empty");
		
		nStack.push("I LOVE JAVA"); //add
		nStack.push("I HATE JAVA");
		nStack.push("JAVA <3");
		
		nStack.peek(); //peek
		
		nStack.push("fuq Java"); //add
		nStack.push("Just kidding");
		nStack.push("No im not!");
		if(nStack.isEmpty()) 	//empty?
			System.out.println("Stack is empty");		
		System.out.println("Size :"+nStack.size()); // check size
		
		System.out.println(nStack.pop());		
		System.out.println(nStack.pop());
		System.out.println("Size :"+nStack.size()); // check size
		
			
		// kolla genom Array(rörde inte Array)
		Iterator<Object> itera = nStack.iterator(); 
		while (itera.hasNext()) //print out every element
			System.out.println(itera.next());
		
		
		
	}
		
	
	
}
