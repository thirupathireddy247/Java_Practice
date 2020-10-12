package Practice_java;

public class Primenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		
		/*for(int i=2;i<=100;i++)
		{
			for(int j=2;j<=i;j++)
			{
				if(i==j)
				{
					System.out.println(i);
				}
				if(i%j==0)
				{
					break;
				}
			}
		}*/
		for(int i=2;i<=a.length;i++)
		{
			for(int j=2;j<=i;j++)
			{
				if(i==j)
				{
				System.out.println(i);
				}
				if(i%j==0)
				{
					break;
				}
			}
		}
		
		

	}

}
