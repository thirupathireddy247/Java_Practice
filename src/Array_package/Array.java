package Array_package;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,6,7,8,9,10};           
		//System.out.println(a);
		/*
		 * int sum=0; for(int i=0;i<a.length;i++) { sum=sum+a[i];
		 * //System.out.println(a[i]); } System.out.println(sum);
		 */
		for(int i=0;i<a.length;i++)
        {
			System.out.println(a[i]);
			if(a[i]==8)
			{
				System.out.println(i);//how to get the index of 8th element array
				break;
			}
			}
	}

}




//The main advantage of arrays is we can represent multiple values with a single variable
//disadvantage:
//Arrays are fixed in size
//Arrays can hold only homogenious data type elements
//But we can resolve this problem b using object arrays
//By Using arrays we can hold primitive and object types
//int[]-primitive
//Integer[]-object