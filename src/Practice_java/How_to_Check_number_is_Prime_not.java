package Practice_java;

public class How_to_Check_number_is_Prime_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=31;
		//int i=2;
		 boolean flag=false;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println(n + " is a prime number");
		}
		else
		{
			System.out.println( n + " is not a aprime number");
		}
		
		
	}
	
	}
