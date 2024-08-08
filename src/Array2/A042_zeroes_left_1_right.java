package Array2;

import java.util.Arrays;

public class A042_zeroes_left_1_right {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   int nums[] = {0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1};
		   
		   int temp=0;
		   
		   for(int i=0;i<nums.length;i++) {
			   for(int j=0;j<nums.length;j++) {
			   if(nums[i]<nums[j])
			   {
				   temp = nums[i];
				   nums[i]=nums[j];
				   nums[j] = temp;
			   }
		   }}
		   
		   System.out.println(Arrays.toString(nums));

	}

}
