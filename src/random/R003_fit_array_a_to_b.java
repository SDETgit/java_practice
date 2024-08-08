package random;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class R003_fit_array_a_to_b {
	 public static int romanToInt(String s) {
		    int nums[] = new int[s.length()];
		    for(int i = 0; i < s.length(); i++){
		        switch (s.charAt(i)) {
		            case 'M':
		                nums[i] = 1000;
		                break;
		            case 'D':
		                nums[i] = 500;
		                break;
		            case 'C':
		                nums[i] = 100;
		                break;
		            case 'L':
		                nums[i] = 50;
		                break;
		            case 'X' :
		                nums[i] = 10;
		                break;
		            case 'V':
		                nums[i] = 5;
		                break;
		            case 'I':
		                nums[i] = 1;
		                break;
		        }
		    } 
		    
		    int sum = 0;
		    for(int i=0; i<nums.length-1; i++){
		        if(nums[i] < nums[i+1])
		            sum -= nums[i];
		        else
		            sum += nums[i];
		    }
	         
		    return sum + nums[nums.length-1];
		}
	   public static void printe(int c,int t)
	    {    
	       
	        System.out.println(c);
	         if(c<t){
	        printe(c+1,t);}
	        
	    }

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String a[] = {"Ram","Bea","Bea","Ram","Sam"}; 
//		
//		HashMap <String, Integer> hm = new HashMap<>();
//		
//		for(String v:a)
//		{
//			if(hm.containsKey(v)==false)
//			{
//			hm.put(v,1);
//			}
//			else
//			{
//				hm.put(v, hm.get(v)+1);
//			}
//		}
//		
//		System.out.println(hm);
//		printe(1,10);
		
		romanToInt("XCVIII");
	}
}
