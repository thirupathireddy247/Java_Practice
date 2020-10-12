package Practice_java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class How_to_add_two_lists_and_remove_the_duplicates_on_that_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>l=new ArrayList<String>();
		l.add("tiru");
		l.add("hello");
		l.add("hai");
		l.add("tiru");
		List<String>l2=new ArrayList<String>(l);
		l2.add("thiru");
		l2.add("hello");
		l2.add("hai");
		l2.add("thiru");
		System.out.println(l2);
		Set<String >s=new HashSet<String>(l2);
		System.out.println(s);

	}

}
