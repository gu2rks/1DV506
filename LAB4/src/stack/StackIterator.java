package aa224iu_lab4.stack;

import java.util.Iterator;

public class StackIterator implements Iterator<Object> {
	private int next = 0;
	private Object[] element;
	private int max = 0;

	public StackIterator(Object[] x, int max) {
		element = x;
		this.max = max;
	}

	public boolean hasNext() {
		if (next < max) 
			return true;
		 else
			return false;
	}

	public Object next() {
		return element[next++];
	}

}
