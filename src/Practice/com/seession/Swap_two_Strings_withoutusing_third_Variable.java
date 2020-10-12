package Practice.com.seession;

public class Swap_two_Strings_withoutusing_third_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="thiru";
		String s2="gopal";
	
		System.out.println("before swapping a,b:"  + s1 +" ," + s2);
		s1=s1+s2;
		s2=s1.substring(0,5);
		System.out.println(s2);
		s1=s1.substring(5,10);
		System.out.println(s1);
		System.out.println("After swappint two Strings s1,s2 :" + s1 + " ,"+ s2);
		

	}

}
