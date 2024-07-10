package L1_Arrays;

import java.util.Arrays;

public class J18_Second_largest {
	public static void main(String[] args) {
		  	int [] a = {466,1,2,3,4,1,5,6,7,8,2,43};
	       
		  	int max = Integer.MIN_VALUE;
		  	int smax = Integer.MIN_VALUE;
		  	for(int i=0;i<a.length;i++)
		  	{
		  		if(max <a[i])
		  		{
		  		smax = max;
		  		max = a[i];
		  		}
		  		else if (a[i]>smax && a[i]!=max)
		  		{
		  			smax = a[i];
		  		}
		  		
		  	}
		  	System.out.println(smax);
	}

}
