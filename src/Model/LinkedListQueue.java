package Model;

import java.util.LinkedList;

public class LinkedListQueue<O> {
	
	LinkedList<O> linkL = new LinkedList<O>();

	// add at the end
	public void enqueue(O o) {
		linkL.add(o);
	}

	// return first index and delete it
	public O dequeue() {
		O firstIndexObj = linkL.get(0);
		linkL.remove(0);
		return firstIndexObj;
	}

	// verify if the last index in the list is empty
	public boolean isEmpty(LinkedList<O> linkL) {
		return linkL.size() == 0;
	}
}
