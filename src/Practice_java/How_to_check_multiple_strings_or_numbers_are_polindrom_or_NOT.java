package Practice_java;

import java.util.Scanner;

public class How_to_check_multiple_strings_or_numbers_are_polindrom_or_NOT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter a String:");
		
		String s=scan.nextLine() ;
		String reverse = "";
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse=reverse+s.charAt(i);
		}
		if(s.equals(reverse))
		{
			System.out.println( s +" is a polindrom");
		}
		else
		{
			System.out.println( s + " is not a polindrom");
		}
		}

	}


