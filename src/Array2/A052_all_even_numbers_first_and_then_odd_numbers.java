package Array2;

import java.util.Arrays;

public class A052_all_even_numbers_first_and_then_odd_numbers {
//Note: The triangle inequality states that the sum of the lengths of any two sides of a 
	//triangle must be greater than or equal to the length of the third side.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {20, 12, 23, 17, 7, 8, 10, 2, 1, 0}; //[20, 12, 8, 10, 2, 0, 17, 7, 1]

		int b [] = new int [nums.length-1];
		int count=0;
		for(int a : nums)
		{
			if(a%2==0)
			{
				count++;
			}
		}
		int k =0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==0)
			{
				b[k] = nums[i];
				k++;
			}
			else if (nums[i]%2!=0)
			{
				b[count-1] = nums[i];
				count++;
			}
		}
		System.out.println(Arrays.toString(b));

	}

}
