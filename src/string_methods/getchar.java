package string_methods;

public class getchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="thirupathireddy alla";
		char[] ch=new char[7];
		a.getChars(10, 17, ch, 0);
		System.out.println(ch);
	}

}
