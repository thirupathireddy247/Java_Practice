package Practice_java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class How_to_get_the_duplicates_in_a_multiple_Strings {

	
	public void countDupChars(String str){
		 
		Map<Character, Integer> map = new HashMap<Character, Integer>(); 
		 
	    char[] chars = str.toCharArray();
	 
	    for(Character ch:chars){
	      if(map.containsKey(ch)){
	         map.put(ch, map.get(ch)+1);
	      } else {
	         map.put(ch, 1);
	        }
	    }
	 
	    Set<Character> keys = map.keySet();
	 
	   
	    for(Character ch:keys){
	      if(map.get(ch) > 1){
	        System.out.println("Char "+ch+" "+map.get(ch));
	      }
	      }
	    }
	  
	 
	  public static void main(String a[]){
 How_to_get_the_duplicates_in_a_multiple_Strings obj = new How_to_get_the_duplicates_in_a_multiple_Strings();
	    System.out.println("String: BeginnersBook.com");
	    System.out.println("-------------------------");
	   obj.countDupChars("BeginnersBook.com");
	  
	    System.out.println("\nString: ChaitanyaSingh");
	    System.out.println("-------------------------");
	    obj.countDupChars("ChaitanyaSingh");
	 
	    System.out.println("\nString: #@$@!#$%!!%@");
	    System.out.println("-------------------------");
	    obj.countDupChars("#@$@!#$%!!%@");
	    System.out.println("/nString : Thirupathireddy");
	    System.out.println("-------------------------");
	    obj.countDupChars("Thirupathireddy");
				
	}

}
