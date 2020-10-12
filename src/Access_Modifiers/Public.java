package Access_Modifiers;

//import Practice_java.Default1;
import Practice_java.Protected1;

public class Public  extends Default//extends Protected1
{
	
	// variable/method as public .then you will have across anywhere
	public int b=20;
	public void getmethod()
	{
		System.out.println("public method");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Public p=new Public();
		p.getmethod();
		//p.b;
		//p.addititon();
		//p.substraction();
		p.getdefaultmethod();
		
	
	

	}

}
