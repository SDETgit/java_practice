package L1_Arrays;

import java.util.Arrays;

public class J031_average_excluding_largest_smallest_array2 {

	public static void main(String[] args) {

			int a[] = {1,2,3,4,5,6,7,8,9,10,11,3};
			int max =Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			double ave =0;
				for(int v:a)
				{
					if(max < v)
					{
						max=v;
					}
					
					if(min >v)
						
					{
						min = v;
					}
					ave = ave+v;
					
					
					
				}
				
				ave = (ave-min-max)/(a.length-2);
				       System.out.println("Average is "+ave);
	}
	}

	