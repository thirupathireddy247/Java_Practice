package Practice_java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class How_TO_Convert_Firstletterto_Uppercase_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="thirupathi";
		
	String b=a.substring(0,1).toUpperCase();
		//String b=a.toUpperCase(); //Convert entire string to upper case
		System.out.println(b); 
		System.out.println(a.substring(0,1).toUpperCase()+a.substring(1)); // convert first letter uppercase and remaining same
		System.out.println(a.replace('h','a'));
		
				
		
		
		}
		
		
		
		


}

