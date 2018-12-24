package aa224iu_lab4.stack;

import java.util.Iterator;

public class LiFoStack implements Stack {

	private Object[] x = new Object[10];
	private int count = 0;

	public int size() {
		return count;
	}

	public boolean isEmpty() {
		if (count != 0)
			return false;
		else
			return true;
	}

	public Object peek() {
		if (count == 0)
			throw new IllegalStateException("Stack is empty");

		else
			return x[0];
	}

	public void push(Object element) {
		if (count == 9)
			resize();
		
		for (int i = count + 1; i > 0; i--) {
			x[i] = x[i - 1];

		}

		count++;
		x[0] = element;

	}

	public Object pop() {
		if (count == 0)
			throw new IllegalStateException("Stack is empty");

		else {
			Object popUp = x[0];
			for (int i = 0; i < count - 1; i++) {
				x[i] = x[i + 1];
			}

			count--;
			return popUp;
		}
	}
	
	public void resize() {
		Object [] temp = new Object [count*2];
		for (int i = 0; i < count ; i++) {
			temp[i] = x [i];
		}
		x = temp;
		
	}
	
	public Iterator<Object> iterator(){
		return new StackIterator(x, count);
	}

}
