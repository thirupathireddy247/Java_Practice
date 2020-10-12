package Practice_java;

public class how_to_Count_the_charcters_of_samename {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="Hello thiru Hello";
		String s1=a.substring(0,5);
		System.out.println(s1);
		String s2=a.substring(6,11);
		System.out.println(s2);
		String s3=a.substring(12,17);
		System.out.println(s3);
		String s4=s1+s3;
		System.out.println(s4);
		char ch;
		int count=0;
		
		for(int i=0;i<s4.length();i++)
		{
			ch=s4.charAt(i);
			count++;
		}
		System.out.println(count);
	}

}
