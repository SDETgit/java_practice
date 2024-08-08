package Array2;

import java.util.Arrays;

public class A051_zeroes_to_left {
//Note: The triangle inequality states that the sum of the lengths of any two sides of a 
	//triangle must be greater than or equal to the length of the third side.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = { 0, 0, 1, 1, 0, 1, 1, 1, 0 }; //[0, 0, 0, 0, 1, 1, 1, 1, 1]

		int temp =0;
		for(int i=0;i<nums.length;i++)
		{
			for(int j=0;j<nums.length;j++)
			{
				if(nums[j]>nums[i])
				{
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
					}
			}
		}
		System.out.println(Arrays.toString(nums));
	}

}
