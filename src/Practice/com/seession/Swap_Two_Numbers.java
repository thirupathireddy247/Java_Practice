package Practice.com.seession;

public class Swap_Two_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b;
		a=27;
		b=15;
		System.out.println("Before swapping a,b:" +a +", "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping a,b:="+ a+"," +b);
	}

}
