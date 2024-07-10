package L1_Arrays;

import java.util.Arrays;

public class J028_moving_zeroes_to_the_end {

	public static void main(String[] args) {

			int a[] = {2,0,0,0, 4,0,0, 8,0};
			int temp =0;
			for(int i=0;i<a.length;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]<a[j])
					{
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
	       System.out.println(Arrays.toString(a));
	}
	}

	