import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer, String> ht=new Hashtable<Integer,String>();
		ht.put(1, "Hello");
		ht.put(2, "thirupathi");       //It will print reverse order
		ht.put(3, "Hi");
		ht.put(4, "Maneeha");
		ht.put(5, "");
	  //ht.replace(2, "hai");
		//ht.put(null,"Hello");      //It will not allow any null keys
		System.out.println(ht);
		Set s=ht.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
			Map.Entry m=(Map.Entry)i.next();  
			//System.out.println(m.getKey());     //It will not seperatley keys and values
			//System.out.println(m.getValue());
		}

	}

}
