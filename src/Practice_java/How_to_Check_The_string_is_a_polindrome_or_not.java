package Practice_java;

public class How_to_Check_The_string_is_a_polindrome_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abba";
		String reverse="";
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse=reverse+s.charAt(i);
		}
		System.out.println(reverse);
		if(s.equals(reverse))
		{
			System.out.println( s + "is a polindrom number");
		}
		else
		{
			System.out.println(s + " is not a polindrom number");
		}
	}

}
