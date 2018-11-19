package collections;

public class collectionsprogram {

	public static void main (String[]args) {
		System.out.print("Surname start with P:\n");
		collections c1 = new collections();
		
		c1.addItem("Peach");
		c1.addItem("Pear");
		c1.addItem("Serena");
		
		while (c1.hasNext()==true) {
			String surname = c1.getNext();
			String s1 = surname.substring(0, 1);
			String s2 = "P";
			if (s2.equals(s1)) {
				System.out.print(surname+"\n");
			}
		}
	
	
	
	
	}
	
	

	//public collectionsprogram() { } // does nothing for now

}
