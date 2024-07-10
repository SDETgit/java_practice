package Questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;


public class Q_003_fit_array_a_to_array_b {

	public static void main(String[] args) {
		int c [] = new int[8];	

		c[1]= 1;
		c[2]= 2;
		c[3]= 3;
		c[4]= 4;
		c[5]= 5;
		int a [] = {1,2,3,4,5,0,0,0};
		int b [] = {6,7,8};
		int k =0;
		
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]==0)
			{
				a[i]= b[k];
				k++;
			}
			
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(c));
	}
	
}
