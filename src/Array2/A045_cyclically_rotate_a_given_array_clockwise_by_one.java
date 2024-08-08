package Array2;

import java.util.Arrays;

public class A045_cyclically_rotate_a_given_array_clockwise_by_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int nums[] = {10, 20, 30, 40, 50, 60}; //output [60, 10, 20, 30, 40, 50]
//		 int temp = nums[0];
//		 for(int i=0;i<nums.length-1;i++)
//		 {
//			 nums[i]=nums[i+1];
//			 
//		 }
//		 
//		 System.out.println(Arrays.toString(nums));
		 
		 int n = 1;
		 for(int k=0;k<1;k++) {
			 int first = nums[0],j;
			 for(j=0;j<nums.length-1;j++) {
				 nums[j]=nums[j+1];
			 }
			 nums[j] = first;
		 }
		 System.out.println(Arrays.toString(nums));
		 m
	}

}
