package Questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class Q012_non_first_element_linkedHashMap {
	 

	public static void main(String[] args) {
			int a [] = {2,2,3,3,4,5,6,7,6,7,4,5};
			LinkedHashMap<Integer,Integer> hm = new LinkedHashMap<Integer,Integer> ();
 			
			for(int v:a) {
			if(hm.containsKey(v)==false) {
				hm.put(v, 1);
			}
			else 
			{
				hm.put(v, hm.get(v)+1);
			}
	}
			System.out.println(hm);
			Integer key=null;
			
			for(Map.Entry<Integer, Integer> e: hm.entrySet())
			{
				if(e.getValue()==1)
				{
					 key = e.getKey();
					break;
				}
				
				
			}
			
			if(key==null)
			{
				System.out.println("not found");
			}
			else
			{
				System.out.println("Value is "+key);
			}
}
}
