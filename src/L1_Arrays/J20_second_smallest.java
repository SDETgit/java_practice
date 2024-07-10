package L1_Arrays;

import java.util.Arrays;

public class J20_second_smallest {
	public static void main(String[] args) {
		  	int [] a = {466,1,2,3,4,1,5,6,7,8,2,43};
	       
		  	int min = Integer.MAX_VALUE;
		  	int smin = Integer.MAX_VALUE;
		  	int tmin = Integer.MAX_VALUE;
		  	for(int i=0;i<a.length;i++)
		  	{
		  		if(min>a[i])
		  		{
		  			smin = min;
		  			min = a[i];
		  			
		  		System.out.println("Value of max "+min+"value of secon min "+smin+" value of a[i] "+a[i]);
		  		}
		  		else if (smin>a[i]&&a[i]!=min)
		  		{
		  			smin = a[i];
		  		}
		  		
		  	}
		  	System.out.println(smin+" "+min);
	}

}
