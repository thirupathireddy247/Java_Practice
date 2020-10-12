package Practice_java;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Practice  {
	
	
	public static void main(String args[])
	{
		 int[] man = {4,56,98,89,78,45,78, 79, 56};

	        for (int i = 0; i < man.length; i++)
	        {
	            for (int j = i+1; j < man.length; j++)
	            {
	                //check if it is equal
	               if (man[i] == man[j])
	                {

	                     man[j] = man[j] -1;

	               //Decrementing size

	                   j--;
	                }
	            }
	        }

	         //Array without duplicates

	        for(int k=0; k<man.length; k++)
	        {

	            System.out.print(" " + man[k]);
	        } 
	}

        		
}





		

