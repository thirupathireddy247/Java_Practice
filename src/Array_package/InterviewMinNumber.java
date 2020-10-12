package Array_package;

public class InterviewMinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{3,4,5},{5,7,8},{2,3,4}};
	int min =a[0][0];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
					
				}
			}
		}
		System.out.println(min);
	}

}
