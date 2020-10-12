package Practice.com.seession;

import java.util.Scanner;

public class Check_The_Number_is_Even_ornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 /* Scanner s=new Scanner(System.in);
  System.out.println("Enter a number");
  int a=s.nextInt();
  if(a % 2==0)
  {
	  System.out.println("Even number");
  }
  else
  {
	  System.out.println("odd number");
  }*/
  
		int a[]= {2,3,4,5,6,7};
		for(int i=2;i<a.length;i++)
		{
			
			if(i%2==0)
			
				{
					  System.out.println("Even number");
				  }
				  else
				  {
					  System.out.println("odd number");
				  }
			
			
		}
		  
	
	}
}
