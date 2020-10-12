package Access_Modifiers;

public class Private  
{
	
	//private:you can not access method or variable outside the class of same package
	
	//int a=5;
	 private int b=10;
	 private void getdata()
	 {
		 System.out.println("private method");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Private pr=new Private();
		pr.getdata();
		
	
		
		 

	}

}
