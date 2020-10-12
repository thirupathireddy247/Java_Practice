package Practice_java;

public class How_to_print_the_vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="asthwen k1@um^2ar";
		int vowels=0;
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(ch=='a' || ch=='e'|| ch=='i' ||ch=='o' || ch=='u')
			{
				System.out.println(str.charAt(i));	}
		}
	}

}
