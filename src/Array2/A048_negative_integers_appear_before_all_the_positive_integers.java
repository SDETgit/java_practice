package Array2;

import java.util.Arrays;

public class A048_negative_integers_appear_before_all_the_positive_integers {
//Note: The triangle inequality states that the sum of the lengths of any two sides of a 
	//triangle must be greater than or equal to the length of the third side.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {-4, 8, 6, -5, 6, -2, 1, 2, 3, -11};
		 int temp=0;
		for(int i=0;i<nums.length;i++)
		{
			for(int j=0;j<nums.length;j++) {
				if(nums[j]<nums[i]) {
					temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(nums));
	}

}
