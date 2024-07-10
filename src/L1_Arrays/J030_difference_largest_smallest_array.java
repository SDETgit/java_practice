package L1_Arrays;

import java.util.Arrays;

public class J030_difference_largest_smallest_array {

	public static void main(String[] args) {

						int a[] = {1,2,3,4,5,6,7,8,9,10,11,-111};
						int max =Integer.MIN_VALUE;
						int min = Integer.MAX_VALUE;
						
							for(int v:a)
							{
							
								if(max<v)
								{
									max =v;
								}
								
								if(min >v)
								{
									min = v;
								}
							}
							       System.out.println("Difference is " +(max-min));
	}
	}

	