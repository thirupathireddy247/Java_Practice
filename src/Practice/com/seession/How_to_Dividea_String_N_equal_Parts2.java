package Practice.com.seession;

public class How_to_Dividea_String_N_equal_Parts2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		/*
		 * String a="a_simple_divide_string_quest"; int n=4; int length=a.length(); int
		 * chars=length/n; String[] s=new String[n];
		 * 
		 * for(int i=0;i<length;i=i+chars) { String substring=a.substring(i,i+chars);
		 * 
		 * System.out.println(substring);
		 * 
		 * }
		 */
		String a="abcdefghijklmnopqrstuvwxy";
		int length =a.length();
		int n=5;
		int chars=length/n;
		for(int i=0;i<length;i=i+chars)
		{
			String b=a.substring(i,i+chars);
			System.out.println(b);
		}
		
	
	}

}
