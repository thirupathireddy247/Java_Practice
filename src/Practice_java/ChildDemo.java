package Practice_java;

public class ChildDemo extends ParentsDemo {
	
	String name="thiru";
	public ChildDemo()
	{
		System.out.println("child constructor");    //Constructor
	}
	public void getData()
	{
		super.getdata();
		System.out.println(name);    //It will print child class name or local name
		System.out.println(super.name);  //when use super keyword it will print parent class name
		System.out.println("child mathod");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildDemo c=new ChildDemo();
		c.getData();

	}

}
