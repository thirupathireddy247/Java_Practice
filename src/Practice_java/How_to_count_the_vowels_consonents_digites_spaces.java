package Practice_java;

public class How_to_count_the_vowels_consonents_digites_spaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="test automation selenium 2020 for april14 pendamic";
		char ch;
		int vowels=0;
		int consonents = 0;
		int digites = 0;
		int spaces = 0;
		
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(ch=='a' || ch == 'e'|| ch == 'i' || ch== 'o'|| ch== 'u')
			{
				vowels++;
			}
			else if(ch >= 'a' && ch <= 'z')
			{ 
				consonents++;
			}
			else if(ch >='0' && ch <= '9')
			{
				digites++;
			}
			else if(ch== ' ')
			{
				spaces++;
			}
		}
		System.out.println( " Vowels  count is " + vowels);

		System.out.println( " consonents  count is " + consonents);

		System.out.println( " digites  count is " + digites);

		System.out.println( " spaces  count is " + spaces);
		

	}

}
