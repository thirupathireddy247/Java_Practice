package Practice.com.seession;

public class How_to_Dividea_String_N_equal_Parts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String a="aaaabbbbcccc"; int length=a.length(); //System.out.println(length);
		 * int n=3; int temp=0; int chars =length/n; String[] s=new String[n]; if(length
		 * % n!=0) { System.out.println("this string can be divide into a" + n
		 * +"equal parts"); } else { for(int i=0;i<length;i=i+chars) { String
		 * s1=a.substring(i,i+chars); System.out.println(s1); s[temp]=s1; temp++;
		 * 
		 * } System.out.println(n+"equal parts of given string are");
		 * 
		 * for(int i=0;i<s.length;i++) { System.out.println(s[i]); }
		 * 
		 * } {
		 * 
		 * }
		 */
		
		    // or
		
		String a="aaaabbbbcccc";
		int n=3;	
	int length=a.length();
	int chars=length/n;
	//String[] s=new String[n];
	if(length % n!=0)
	{
		System.out.println("print the "+ n+ "equal parts");
	}
	else
	{
		for(int i=0;i<length;i=i+chars)
		{
			String substring=a.substring(i,i+chars);
			
			System.out.println(substring);
		
			}
		
		}
	
	}

}
