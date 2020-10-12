package string_methods;

public class getBytes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="thiru";
		System.out.println(a.getBytes());
		byte[] b=a.getBytes();
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		

	}

}
