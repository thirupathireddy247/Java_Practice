package Collections;

import java.util.ArrayList;

public class ArrayList_Demo {
	
	//array have fixed size where arraylist can grow dynamically
	//You can access and insert any value in any index
	//Length of the ArrayList is provided by the size() method while Each array object has the length variable which returns the length of the array.
	//Array use multidimensional and arraylist use singledimensional
	//Arraylist,Linked list,Vector can implement List interface
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>();
		a.add("thiru");
		a.add("Alla");
		a.add("Alla");
		System.out.println(a);
		a.add(1, "reddy");
		a.remove(1);
		System.out.println(a);
		System.out.println(a.contains("alla"));
		System.out.println(a.get(2));
		System.out.println(a.indexOf("thiru"));
		
		/*
		 * a.remove(1); System.out.println(a); a.remove("Alla"); System.out.println(a);
		 */
		System.out.println(a.size());
	
		
		


	}

}
