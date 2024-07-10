package L1_Arrays;

import java.util.Arrays;

public class J027_common_elements_in_sorted_arrays {

	public static void main(String[] args) {

			int a[] = {2, 4, 8};
	        int b[] = {2, 3, 4, 8, 10, 16};
	        int c[] = {4, 8, 14, 40};
	        
	        for(int i=0;i<a.length;i++) {
	        	for(int j=0;j<b.length;j++) {
	        		for(int k =0;k<c.length;k++)
	        		if(a[i]==b[j]&&a[i]==c[k])
	        		{
	        			System.out.println(" Element for a "+a[i]+" "+i+" Element for b "+b[j]+" "+j
	        					+" Element for c "+c[k]+" "+k);
	        		}
	        	}
	        }
	}
	}

	