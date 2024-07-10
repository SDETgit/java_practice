package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class C_003_hashmap {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();    
	    System.out.println("Initial list of elements: "+hm);  
	      hm.put(100,"Amit");    
	      hm.put(101,"Vijay");    
	      hm.put(102,"Rahul");   
	      
	      for(Map.Entry m : hm.entrySet())
	      {
	    	  System.out.println(m.getKey()+" "+m.getValue());
	      }
	      
	      hm.putIfAbsent(103, "Gaurav");  
	      hm.putIfAbsent(103, "Gaurav1");   //Works on the basis of key not value 
	      hm.put(103, "Gaurav2");  
	      System.out.println(hm);
		 
	}
}
