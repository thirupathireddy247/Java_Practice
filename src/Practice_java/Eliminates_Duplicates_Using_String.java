package Practice_java;

public class Eliminates_Duplicates_Using_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "Hello World!";
	    int l = s.length();
	    char ch;
	    String result = "";
	    for (int i = 0; i < l; i++) {
	        ch = s.charAt(i);
	        System.out.println(ch);
	        
	      if (ch != ' ') {
	            result = result + ch;
	           // System.out.println(result);
	        }
	        // Replacing space in all occurrence of the current character
	       s = s.replace(ch, ' ');
	    }
	   System.out.println("After removing duplicate characters : " + result);

	}

}
