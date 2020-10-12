package Collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.HashMap<Integer,String> h=new java.util.HashMap<Integer,String>();  //Keys,values
		h.put(1,"alla");
		h.put(2, "gopal");
		h.put(3, "Barathi");
		h.put(4, "thirupathi");
		h.put(5,"");
		h.put(6,"");
		h.put(  null, "hello");
		h.put(  null, "hi");       //It will take only one null key and number null values
		h.replace(1, "alla","yeshwanth");
		
		
		System.out.println(h);
		
		System.out.println(h.get(3));
		System.out.println(h.replace(2, "gopal", "Gopalreddy"));
		
		Set s=h.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			Map.Entry m=(Map.Entry)i.next();
			System.out.println(m.getKey());   //if you want seperately print keys
			System.out.println(m.getValue());  //If you want seperately print values
		}
		
	}

}
