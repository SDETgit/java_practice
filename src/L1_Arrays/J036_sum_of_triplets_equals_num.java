package L1_Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class J036_sum_of_triplets_equals_num {

	public static void main(String[] args) {

			int a [] = {1,-2,0,5,-1,-4};
			int t=2;
			
			for(int i=0;i<a.length;i++)
			{
				for(int j=i+1;j<a.length;j++) {
				for(int k=j+1;k<a.length;k++) {
					if(t==(a[i]+a[j]+a[k])) {
						System.out.println(a[i]+" "+a[j]+" "+a[k]+" "+i+" "+j+" "+k);
					}
					
				}
			}
				
			}
	
	}
	}

	