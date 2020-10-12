package Practice_java;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String a="Gopal";
    String reverse="";
		
    
    
    for(int i=a.length()-1;i>=0;i--)
    {
    System.out.println(a.charAt(i));
    	reverse=reverse+a.charAt(i);
    }
    System.out.println(reverse);
	}

}
