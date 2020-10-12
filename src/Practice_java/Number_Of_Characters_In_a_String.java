package Practice_java;

public class Number_Of_Characters_In_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  String a="thirupathireddy alla"; int count=0;
		  
		  for(int i=0;i<=a.length();i++) { a.charAt(i);
		  
		  count++;
		  } 
		  System.out.println(count);
		 
		
		//or
		
		/*String str = "123abcdfg897";
	      int count = 0;
	      System.out.println("String: "+str);
	      for (int i = 0; i < str.length(); i++) {
	         if (Character.isDigit(str.charAt(i)))
	         count++;
	      }
	      System.out.println("Letters: "+count);*/
		
		//or
		
		/*String str= "123ThirU567";
		int count= 0;
		System.out.println("String: "+str);
		for(int i = 0; i < str.length(); i++)
		{
			if (Character.isLowerCase(str.charAt(i)))
			count++;
			}
	   System.out.println("Letters: " + count);*/
		
		//or
		/* str= "123ThirU567";
		int count= 0;
		System.out.println("String: "+str);
		for(int i = 0; i < str.length(); i++)
		{
			if (Character.isLetter(str.charAt(i)))
			count++;
			}
	   System.out.println("Letters: " + count);*/
		
		
	}

}
