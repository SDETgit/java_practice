package L1_Arrays;

import java.util.Arrays;

public class J017_Integer_remove_duplicates {
	public static void main(String[] args) {
		  	int [] a = {1,2,3,4,1,5,6,7,8,2};
	       
		  	int count =0;
		for (int i = 0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					break;
				}
			}
		}
	
		int[] b = new int[a.length-count];
		int s =0;
		System.out.println(count+" "+a.length+" "+b.length);
		boolean isDuplicate ;
		for(int i=0;i<a.length;i++)
		{
			isDuplicate =false;
			for(int j=i+1 ;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					isDuplicate  = true;
					break;
				}
			}
			if(isDuplicate==false )
			{
				b[s] = a[i];
				s++;
			}
		}
		System.out.println(Arrays.toString(b));
		}

}
