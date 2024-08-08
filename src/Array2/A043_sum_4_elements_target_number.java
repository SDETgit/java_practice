package Array2;

import java.util.Arrays;

public class A043_sum_4_elements_target_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int nums[] = {10, 20, 30, 40, 1, 2};
		   
		  int s = 53;
		  
		  for(int i=0;i<nums.length;i++) {
			  for(int j=i+1;j<nums.length;j++)
			  {
				  for(int k=j+1;k<nums.length;k++) {
					  for(int l=k+1;l<nums.length;l++) {
						  if((nums[i]+nums[j]+nums[k]+nums[l])==53)
							  System.out.println(nums[i]+" "+nums[j]+" "+nums[k]+" "+nums[l] );
					  }
				  }
			  }
		  }
//10 40 1 2
// 20 30 1 2

	}

}
