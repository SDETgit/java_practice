package L1_Arrays;

import java.util.Arrays;

public class J7_removing_element_array {

	public static void main(String[] args) {
		
		int a [] = {1789, 2035, 1899, 1456, 2013, 
	            1458, 2458, 1254, 1472, 2365, 
	            1456, 2165, 1457, 2456};
		
		int re = 2456;
		
		/*
		 * System.out.println("Before deletion "+Arrays.toString(a)); for(int
		 * i=0;i<a.length;i++) { if(a[i]==re) { a[i]=a[i-1]; } }
		 * 
		 * System.out.println("After deletion "+Arrays.toString(a));
		 */	
	
		//Via creating new array 
		int a2 [] = new int[a.length-1];
		
		for(int j=0,  k =0;j<a.length;j++)
		{
			
			if(a[j]!=re) {
				
				a2[k] =a[j];
				k++;
						
				
			}
		}
		
		System.out.println(Arrays.toString(a2));
		
	}

}
