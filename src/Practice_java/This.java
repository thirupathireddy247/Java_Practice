package Practice_java;

public class This {
	int a=2;
	public void getdata()
	{
		int a=3;
		int b=a+this.a;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(b);
	}
	//this refers currnet object-object  scope lies in class level	
	// super keyword refers parent class level and current class level
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This t=new This();
		t.getdata();

	}

}
