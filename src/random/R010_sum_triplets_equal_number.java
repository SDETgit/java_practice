package random;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Stack;
import java.util.TreeSet;

public class R010_sum_triplets_equal_number {
	 

	public static void main(String[] args) {
		int a[] = {1, -2, 0, 5, -1, -4};
				int t =  2;
				
	   for(int i=0;i<a.length;i++)
	   {
		   for(int j=i+1;j<a.length;j++)
		   {
			   for(int k=j+1;k<a.length;k++)
			   {
				  
					   if(t==(a[i]+a[j]+a[k]))
					   {
						   System.out.println(a[i]+" "+a[j]+" "+a[k]+"elements are "+i+j+k);
					   
				   }
    	    
}
}
	   }}}
