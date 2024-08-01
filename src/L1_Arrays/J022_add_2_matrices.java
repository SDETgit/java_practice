package L1_Arrays;

import java.util.Arrays;

public class J022_add_2_matrices {
	public static void main(String[] args) {
		  	int [] a = {466,1,2,3,4,1,5,6,7,8,2,43};
		  	int [] a1 = {466,1,2,3,4,1,5,6,7,8,2,43};
		  	int a2[] = new int [a1.length];
		  	
		  	for(int i=0;i<a.length;i++)
		  	{
		  		a2[i] = a[i] +a1[i];
		  	}
		  System.out.print(Arrays.toString(a2));
		  }

}
