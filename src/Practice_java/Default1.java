package Practice_java;

public class Default1 extends Practice{
	
	public void main(String a,String b,String c)
	{
		System.out.println("barathi is eating");
	}
	
	public static void main(String args[])
	{
		Practice p1=new Practice();  //By using this one we will get only parent methods
		
		Practice p=new Default1();  //By using this one we will get only parent methods
	
		//Default1 d=new Practice();//By using this one we will get compile time error
		
		Default1 p2=new Default1(); //By using this one we will get both parent child methods
		
		//p.hello("thiru", "gopal");
		//p.hai("thiru", "gopal", "barathi");
		
	}
	

	

}
