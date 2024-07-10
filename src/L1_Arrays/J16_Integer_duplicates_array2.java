package L1_Arrays;

import java.util.Arrays;

public class J16_Integer_duplicates_array2 {
	public static void main(String[] args) {
		  	int [] a = {1,2,3,4};
	        int [] b = {4,5,6,7,8,9,0};
	
		for (int i = 0;i<a.length;i++)
		{
			for(int j=0 ;j<b.length;j++)
			{
				
				
				if(a[i]==b[j])
				{
					System.out.println(a[i] );
				}
			}
		}
		}

}
