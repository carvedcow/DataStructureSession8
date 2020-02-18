package Model;

import java.util.ArrayList;
public class ArrayListStack<O> {
	ArrayList<O> arrL = new ArrayList<O>();
	
	// add at the end
	public O push(O o) {
		arrL.add(o);
		return o;
	}
	// return last index and delete it
	public O pop(ArrayList<O> arrL) {
		O lastIndexObj = arrL.get(arrL.size());
		arrL.remove(arrL.size()-1);
		return lastIndexObj;
	}
	
	// verify if the last index in the list is empty
	public boolean isEmpty(ArrayList<O> arrL) {
		return arrL.size() == 0;
	}
}
