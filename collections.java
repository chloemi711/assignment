package collections;

import java.util.ArrayList;

public class collections { 
	ArrayList<String> my_collection;
	int pointer;

	public collections() {
		pointer = 0;
		my_collection = new ArrayList<String>();
		
	}
	public boolean hasNext() {
		my_collection.size();
		if (pointer < my_collection.size()) {
			return true;
		}else {
			return false;
			
		}
	}
	
	public void addItem(String s_to_add){
		my_collection.add(s_to_add);
	}
	
	public String getNext() {
		String toreturn;
		toreturn = my_collection.get(pointer);
		pointer ++;
		return toreturn;
	}


}
