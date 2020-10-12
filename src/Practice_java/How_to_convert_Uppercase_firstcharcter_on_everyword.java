package Practice_java;

public class How_to_convert_Uppercase_firstcharcter_on_everyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hi dude i want apple";
	    s = s.replaceAll("\\s+"," ");
	    String[] split = s.split(" ");
	    s="";
	    for (int i = 0; i < split.length; i++) {
	        split[i]=Character.toUpperCase(split[i].charAt(0))+split[i].substring(1);
	        s+=split[i]+" ";
	        System.out.println(split[i]);
	    }
	    System.out.println(s);

	}

}
