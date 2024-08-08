package random;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class R003_duplicates_with_counts {
	   public static void printe(int c,int t)
	    {    
	       
	        System.out.println(c);
	         if(c<t){
	        printe(c+1,t);}
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[] = {"Ram","Bea","Bea","Ram","Sam"}; 
		
		HashMap <String, Integer> hm = new HashMap<>();
		
		for(String v:a)
		{
			if(hm.containsKey(v)==false)
			{
			hm.put(v,1);
			}
			else
			{
				hm.put(v, hm.get(v)+1);
			}
		}
		
		System.out.println(hm);
		printe(1,10);
	}
}
