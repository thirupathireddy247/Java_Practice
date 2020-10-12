package Practice_java;

public class In_a_String_have_Alphanumric_Values_to_print_onlynumeric_or_Alphabeatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a=" abc d 1234567890pqr 54897";
		String num=a.replaceAll("[^0-9]", "");
		System.out.println(num);

	}

}
