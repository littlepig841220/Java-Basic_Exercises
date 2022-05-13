package CBS;

import java.util.ArrayList;

public class ArrayList_Operations {

	public static void main(String[] args) {
		ArrayList arraylist = new ArrayList();
		
		arraylist.add("abc");
		arraylist.add("123");//Used add() to create a new element
		
		System.out.println("Check arrayList has 'abc' key word\n" + arraylist.contains("abc"));
		System.out.println("Number 1 in arrayList is " + arraylist.get(1));
		
	}

}
