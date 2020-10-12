package Practice_java;

public class Constructor {
	
	public Constructor()
	{
		System.out.println("this is a constructor");     //default constructor
	}
	public Constructor(int a,int b)
	{
		System.out.println("this is a parameteraized constructor");  //parameteraized constructor
	}

	
	 public Constructor(String a) 
	 { 
		 System.out.println(a); 
		 }
	 
	public Constructor(double c,int d)
	{
		System.out.println(c+d);
	}
	public void getdata()
	{
		System.out.println("this si sa method");        //method
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor c=new Constructor();
		Constructor c1=new Constructor(4,5);
		Constructor c2=new Constructor("thiru");
		Constructor c3=new Constructor(5.12,6);

	}

}
