package Array_package;

public class multidimensional_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[2][3];
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		a[1][0]=40;
		a[1][1]=50;
		a[1][2]=60;
		
			System.out.println(a[1][0]);
			int b[][]= {{2,3,5},{5,7,8}};
			System.out.println(b[0][2]);
			
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<3;j++)
				{
					System.out.println(a[i][j]);
				}
			}
		
		

	}

}
