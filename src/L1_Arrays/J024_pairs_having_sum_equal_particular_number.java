package L1_Arrays;


import java.util.Arrays;

public class J024_pairs_having_sum_equal_particular_number {

	public static void main(String[] args) {

		int a [] = {-1,1,2,3,4,5,6,7,-11,9,-12};
		
		int num = 10;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(num ==(a[i]+a[j]))
				{
					System.out.println("Pairs are "+a[i]+" at index "+i+" second is "+a[j]+" at index  " +j);
				}
			}
		}
		

			
			
			
	}}

	