package Practice_java;

public class Exceptions_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//try -we are aware of if any code is failed then you can put that in try block
		//catch-When we got any error then test case is failed. instead of that we can send the catch exception it means test case will be passed
		//when we have a multiple catches but system will print exception related catch
		//multiple catches are allowed
		//finally-once we got the exception  but finally block should be exuceated
		//with out catch we can write try and finally
		//when finally block will be failed.--when you stop the forcefully by jvm then final block will not be exuceate  and remaining all times it will exuceate
		int a=0;
		int b=30;
		try
		{
		int c=b/a;
		System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("this is an arthametic exception");   //it will print because the exception is related to arithmetic exception
		}
		  catch(Exception e) 
		{
			  System.out.println("this is a exception");
			  }
		 
		finally
		{
			System.out.println("test case should be completete");
		}
		
	}

}
