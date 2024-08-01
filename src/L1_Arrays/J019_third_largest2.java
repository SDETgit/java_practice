package L1_Arrays;

import java.util.Arrays;

public class J019_third_largest2 {
	public static void main(String[] args) {
		  	int [] a = {466,1,2,3,4,1,5,6,7,8,2,43};
	       
		  	int max = Integer.MIN_VALUE;
		  	int smax = Integer.MIN_VALUE;
		  	int tmax = Integer.MIN_VALUE;
		  	for(int i=0;i<a.length;i++)
		  	{
		  		if(max <a[i])
		  		{
		  		tmax= smax;	
		  		smax = max;
		  		max = a[i];
		  		}
		  		else if (a[i]>smax && a[i]!=max)
		  		{
		  			tmax =smax;
		  			smax = a[i];
		  		}
		  		else if (a[i]>tmax && a[i]!=smax && a[i]!=max)
		  		{
		  			tmax = a[i];
		  		}
		  		
		  	}
		  	System.out.println(tmax);
	}

}
