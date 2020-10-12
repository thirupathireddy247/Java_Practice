package Practice_java;

import java.util.HashMap;
import java.util.Map;

public class How_many_duplicatecharacters_in_string_using_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		String s = "asdfasdfafk asd234asda";
	    //Map<Character, Integer> charMap = new HashMap<Character, Integer>();
	    
	    Map<Character,Integer> map = new HashMap<Character,Integer>();
	    for (int i = 0; i < s.length(); i++) {
	      char c = s.charAt(i);
	      System.out.println(c);
	      //if (Character.isAlphabetic(c)) {
	      if (map.containsKey(c)) {
	        int cnt = map.get(c);
	        System.out.println(cnt);
	        map.put(c,++cnt);
	      } else {
	        map.put(c, 1);
	      }
	      
	    }
	   // }
	    System.out.println(map);
	    
	    
	   /* char[] arr = str.toCharArray();
	    System.out.println(arr);
	    

		
		for (char value: arr) {
		 
		 if (Character.isAlphabetic(value)) { 
			 if (charMap.containsKey(value)) {
		 charMap.put(value, charMap.get(value) + 1);
		 
		 } 
			 else { charMap.put(value, 1); 
		 } 
			 } 
		 }
		 
		 System.out.println(charMap);*/
		
		
		
		
		
		 
 	}

}
