package Practice.com.seession;

public class Convert_Firstletterto_Uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a="alla thirupathi reddy";
		/*
		 * String b=a.substring(0 , 1 ).toUpperCase()+a.substring(1);
		 * 
		 * System.out.println(b);
		 */
		StringBuffer sb=new StringBuffer(a.length());
		String words[] = a.split("\\ ");
		
		for (int i = 0; i < words.length; i++)
        {
            sb.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1)).append(" ");
 
        }
 
        System.out.println(sb);
		
		
	}

}
