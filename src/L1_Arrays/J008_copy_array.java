package L1_Arrays;

import java.util.Arrays;

public class J008_copy_array {
	public static void main(String[] args) {
		int a [] = {1789, 2035, 1899, 1456, 2013, 
	            1458, 2458, 1254, 1472, 2365, 
	            1456, 2165, 1457, 2456};
		
		int b[] = new int [a.length];
		
		for(int i =0;i<a.length;i++)
		{
			b[i] = a[i];
		}
		System.out.print(Arrays.toString(b));
	}

}
