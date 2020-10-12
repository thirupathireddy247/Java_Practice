package Practice_java;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calendar cal=Calendar.getInstance();
SimpleDateFormat sdf=new SimpleDateFormat("M/d/yyyy hh:mm:ss");

//System.out.println(sdf.toString());
System.out.println(sdf.format(cal.getTime()));
System.out.println(cal.get(Calendar.DAY_OF_MONTH));
System.out.println(cal.get(Calendar.MONTH));
System.out.println(cal.get(Calendar.AM_PM));
System.out.println(cal.get(Calendar.DATE));
System.out.println(cal.get(Calendar.DAY_OF_WEEK));
System.out.println(cal.get(Calendar.DAY_OF_YEAR));
System.out.println(cal.get(Calendar.HOUR_OF_DAY));
System.out.println(cal.get(Calendar.SHORT_FORMAT));
System.out.println(cal.get(Calendar.WEEK_OF_MONTH));
	}

}
