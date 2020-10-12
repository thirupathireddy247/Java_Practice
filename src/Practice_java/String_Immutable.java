package Practice_java;

public class String_Immutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S1="abc";
		S1.concat("xyz");
		System.out.println("S1 is" + S1);
		String S2=S1.concat("def");
		System.out.println("S2 is" + S2);

	}

}
