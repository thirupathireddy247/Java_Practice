package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_demo {
	
	//diff bw set and arraylist
	//Set doesnot accept duplicates but arraylist can accept duplicates
	//set can not maintain sequentioal order but arraylist can maintain sequential
	
	//Hashset,treeset ,linkedhashset implements set interface
	//Arraylist,Linked list,Vector can implement List interface

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				HashSet<Object>hs=new HashSet<Object>();
				hs.add("thiru");
		hs.add("reddy");
		hs.add("thiru");
		System.out.println(hs);
		hs.remove("thiru");
		System.out.println(hs);
		hs.add(123);
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains(123));
		Iterator<Object> i=hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		

	}

}
