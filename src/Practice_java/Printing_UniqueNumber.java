package Practice_java;

import java.util.ArrayList;

public class Printing_UniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {3, 4,5,3,5,4,3,6};
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			int k=0;
			if(!al.contains(a[i]))
			{
				al.add(a[i]);
				k++;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						k++;
					}
				}
			}
			System.out.println(a[i]);
			//System.out.println("number of times of a value is"+k);
			System.out.println(a[i] + " is showing for " + k + " times");
		}
		
		
	}
		

}
