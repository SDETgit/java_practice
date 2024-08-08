package Array2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class A054_array_contains_a_subarray_with_0_sum {
	//Write a Java program to check if a given array contains a subarray with 0 sum.  
	//Example:
	//Input :
	//nums1= { 1, 2, -2, 3, 4, 5, 6 }
	//nums2 = { 1, 2, 3, 4, 5, 6 }
	//nums3 = { 1, 2, -3, 4, 5, 6 }
	//Output:
	//Does the said array contain a subarray with 0 sum: true
	//Does the said array contain a subarray with 0 sum: false
	//Does the said array contain a subarray with 0 sum: true
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {56903,18666,60499,57517,26961}; //[18,6,6,6,1,-1] int nums = {400} /-1
	
		int temp = 0;
		if(nums.length ==1)
		{
			System.out.println("-1");
		}
		else {
		for(int i=1;i<nums.length;i++)
		{
			temp = nums[i];
			for(int j=i+1;j<nums.length;j++)
			{
				if(temp<nums[j])
				{
					temp = nums[j];
				}
				
				
			}
			
			nums[i-1]= temp;
		
			
			if(i==nums.length-1)
			{
				nums[nums.length-1] =-1;
			}
			
			
		}}
		
		System.out.println(Arrays.toString(nums));

	}

}
