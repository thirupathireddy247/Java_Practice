package Practice_java;

public class How_to_Handle_permitations_in_java {

	public void Stringpermutation(String prefix,String str)
	{
			
		

		int length=str.length();
		if(length==0)
		{
			System.out.println(prefix);
			return ;
		}
				for(int i=0;i<length;i++)
		{
			Stringpermutation(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1,length));
		}
	}
	
				public void permutation(String str)
				{
					Stringpermutation("",str);
				}
	
	
	
	public static void main(String args[])
			{

		How_to_Handle_permitations_in_java p=new How_to_Handle_permitations_in_java();
	p.permutation("abcd");
			

	}

}
