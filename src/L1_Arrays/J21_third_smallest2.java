package L1_Arrays;

import java.util.Arrays;

public class J21_third_smallest2 {
	public static void main(String[] args) {
		  	int [] a = {466,1,2,3,4,1,5,6,7,8,2,43};
	       
		  	int min = Integer.MAX_VALUE;
		  	int smin = Integer.MAX_VALUE;
		  	int tmin = Integer.MAX_VALUE;
		  	for(int i=0;i<a.length;i++)
		  	{
		  	if(min > a[i])
		  	{
		  		tmin = smin;
		  		smin = min;
		  		min = a[i];
		  	}
		  	else if(smin > a[i]&& a[i]!=min)
		  	{
		  		tmin=smin;
		  		smin = a[i];
		  	}
		  	
		  	else if (tmin>a[i]&&a[i]!=smin&&a[i]!=min )
		  	{
		  	tmin = a[i];	
		  	}
		  	}
		  	System.out.println(tmin+" "+min);
	}

}
