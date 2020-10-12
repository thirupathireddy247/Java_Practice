package Practice_java;

public class How_to_check_the_integer_is_a_polindrom_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=121;
		int reverse=0;
		int remainder=0;
		int temp=num;
		while(num != 0)
		{
			remainder=num%10;
			reverse=reverse*10+remainder;
			num=num/10;
			
		}
		System.out.println(reverse);
		if(reverse==temp)
		{
			System.out.println(temp + " is a polindrome");
		}
		else
		{
			System.out.println(temp + " is not a polindrome");
		}
				
	}

}
