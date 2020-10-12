package Star_loops;

public class Star_Patteren_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=4;k>=i;k--)
			{
				System.out.print("*");
			}
			for(int l=3;l>=i;l--)
			//for(int l=2;l>=i;l--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
			
		/*
		 * for(int i=0;i<=4;i++) { for(int j=0;j<i;j++) { System.out.print(" "); }
		 * for(int k=7;k>i*2;k--) { System.out.print("*"); } System.out.println(); }
		 */
			

	}

}
