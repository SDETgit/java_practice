package Array2;

import java.util.Arrays;

public class A050__first_element_should_be_maximum_the_second_value_should_be_a_minimum_third_should_be_the_second_maximum_the_fourth_should_be_the_second_minimum_and_so_on {
//Note: The triangle inequality states that the sum of the lengths of any two sides of a 
	//triangle must be greater than or equal to the length of the third side.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100,12,110}; //[100, 10, 90, 20, 80, 30, 70, 40, 60, 50]
		int b[] = new int[nums.length];
		Arrays.sort(nums);
		int k =1;
		System.out.println(nums.length/2);
		for(int i=0;i<nums.length/2;i++)
		{
			b[k] = nums[i];
			k=k+2;
		}
		int l = 0;
		for(int j=nums.length-1;j>=nums.length/2;j--)
		{
			b[l] = nums[j];
			l=l+2;
			
					}
		
		System.out.println(Arrays.toString(b));
	}

}
