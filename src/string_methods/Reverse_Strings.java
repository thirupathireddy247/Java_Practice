package string_methods;

public class Reverse_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="thiru";
		
		//System.out.println(a.length());
		
		  String reverse="";
		  
		  for(int i=a.length()-1;i>=0;i--) {
		  
		  reverse= reverse + a.charAt(i);
		 
		  } System.out.println(reverse);
		 

		
	}

}
