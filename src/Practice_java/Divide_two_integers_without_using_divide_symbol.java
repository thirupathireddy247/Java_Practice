package Practice_java;

public class Divide_two_integers_without_using_divide_symbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dividend=14;
		int divisor=5;
		int quotient=0;
		while(dividend>=divisor)
		{
			dividend=dividend-divisor;
			quotient++;
			
		}
		System.out.println("quotient is "  + quotient);
		System.out.println("remainder is "  + dividend);
		
	}

}
