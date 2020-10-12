package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_The_duplicatesin_Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String>a=new ArrayList<String>();
		a.add("thiru");
		a.add("gopal");
		a.add("barathi");
		a.add("thiru");
		System.out.println("before adding linked hashset" + a);
		Set<String>s=new LinkedHashSet<>(a);
		System.out.println(s);

	}

}
