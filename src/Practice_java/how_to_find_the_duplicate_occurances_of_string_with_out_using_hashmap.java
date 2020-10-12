package Practice_java;

import java.util.Scanner;

public class how_to_find_the_duplicate_occurances_of_string_with_out_using_hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in );

		System.out.println("Enter a string:");

		String s=sc.nextLine();

		s=s.replaceAll(" ","");
		System.out.println(s);

		String temp="";

		for(int i=0;i<s.length();i++){

		if(!temp.contains(s.charAt(i)+"")){

		temp+=s.charAt(i)+"";

		}

		}

		int count=0;

		for(int i=0;i<temp.length();i++){

		for(int j=0;j<s.length();j++)

		{

		if((temp.charAt(i))==(s.charAt(j)))

		{

		count++;

		}

		}

		System.out.println("occerance of "+temp.charAt(i)+" is "+count);

		count=0;

		}
			

	}

}




//or
/*public  void duplicatecharcters(String str)
{
	int length=str.length();

	
	String temp="";

	for(int i=0;i<length;i++){

	if(!temp.contains(str.charAt(i)+"")){

	temp+=str.charAt(i)+"";

	}

	}

	int count=0;

	for(int i=0;i<temp.length();i++){

	for(int j=0;j<str.length();j++)

	{

	if((temp.charAt(i))==(str.charAt(j)))

	{

	count++;

	}

	}

	System.out.println("occerance of "+temp.charAt(i)+" is "+count);

	count=0;

	}
				
	
}
public static void main(String args[])
		{
how_to_find_the_duplicate_occurances_of_string_with_out_using_hashmap p=new how_to_find_the_duplicate_occurances_of_string_with_out_using_hashmap();
	System.out.println("Enter a String");
	p.duplicatecharcters("thirupathireddyhello");
	
	System.out.println("Enter a String 2:");
	p.duplicatecharcters("hello hai");
		}

  
   }*/








