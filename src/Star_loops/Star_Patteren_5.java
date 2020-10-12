package Star_loops;

public class Star_Patteren_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  for(int i=0;i<=4;i++)
  {
	  for(int j=4;j>i;j--)
	  {
		  System.out.print(" ");
	  }
	  for(int k=0;k<=i;k++)
	  {
		  System.out.print("*");
	  }
	  System.out.println();
  }
  for(int i=0;i<=4;i++)
  {
	  for(int j=0;j<=i;j++)
	  {
		  System.out.print(" ");
	  }
	  for(int k=4;k>i;k--)
	  {
		  System.out.print("*");
	  }
	  System.out.println();
  }
	}

}
