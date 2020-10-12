package Collections;

import java.util.ArrayList;
import java.util.Vector;

public class Enumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ArrayList<Integer> a=new ArrayList<Integer>();


		//System.out.println(a);
		Vector v=new Vector();
		for(int i=0;i<=10;i++)
		{
			v.addElement(i);
		}
		System.out.println(v);
		java.util.Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			Integer I=(Integer) e.nextElement();
			
		
		System.out.println(I);
		}
	}

}
