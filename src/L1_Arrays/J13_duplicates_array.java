package L1_Arrays;

import java.util.Arrays;

public class J13_duplicates_array {
	public static void main(String[] args) {
		int a [] = {1,1,2,3,4,4,5,99,77,88,77};
		System.out.println(Arrays.toString(a));
		for (int i = 0;i<a.length;i++)
		{
			for(int j=i+1 ;j<a.length;j++)
			{
				
				System.out.println("Value if i > "+i+" < Value of j> "+ j + " <Value of a[i] and a[j]> " + a[i] +" "+ a[j]);
				if(a[j]==a[i])
				{
					System.out.println(a[j]);
				}
			}
		}
		}

}
