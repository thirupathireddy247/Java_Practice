package Practice.com.seession;

public class Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z;
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.println("Enter the first number");
	 x=s.nextInt();
	 System.out.println("Enter the second numner");
	 y=s.nextInt();
	 z=x;
	 x=y;
	 y=z;
	 System.out.println("After swapping the values:"+x+","+y);
		

	}

}
