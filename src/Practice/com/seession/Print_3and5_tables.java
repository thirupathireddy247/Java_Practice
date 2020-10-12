package Practice.com.seession;

public class Print_3and5_tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\nDivided by 3: " );
		for(int i=1;i<=100;i++)
		{
			if(i%3==0)
			{
				System.out.println(i +", ");
			}
		}
		System.out.println("\n5Th Table");
		for(int i=1;i<=100;i++)
		{
			if(i%5==0)
			{
				System.out.println(i);
			}
		}
		System.out.println("\n\n Divided by 3rd and 5Th");
		for(int i=1;i<=100;i++)
		{
			if(i%3==0 &&i%5==0)
			{
				System.out.println(i);
			}
		}
		

	}

}
