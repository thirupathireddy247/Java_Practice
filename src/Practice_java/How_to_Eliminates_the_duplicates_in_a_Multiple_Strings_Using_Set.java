package Practice_java;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class How_to_Eliminates_the_duplicates_in_a_Multiple_Strings_Using_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstString = "google out";
		String secondString = "stack overflow";

		Set<String> output = new HashSet<String>();
		Collections.addAll(output, (firstString + secondString).split(""));
		System.out.println(output);


	}

}
