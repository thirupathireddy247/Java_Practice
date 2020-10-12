package Star_loops;

public class Star_Patteren_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 for(int i=0;i<=4;i++) 
		 {
			 for(int j=4;j>=i;j--)
		 { 
				 System.out.print(" "); 
				 }
		 for(int k=0;k<=i;k++) 
		 { 
			 System.out.print("*"); 
			 } for(int l=1;l<=i;l++) 
			 {
		 System.out.print("*"); 
		 } System.out.println(); 
		 }
		 
		
		//or
		
		/*
		 * for(int i=0;i<=4;i++) { for(int j=4;j>=i;j--) { System.out.print(" "); }
		 * for(int k=0;k<=i*2;k++) { System.out.print("*"); } System.out.println(); }
		 */
	}

}
