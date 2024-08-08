package Array2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class A053_Replace_Elements_with_Greatest_Element_on_Right_Side {
	//Explanation: 
	// index 0 --> the greatest element to the right of index 0 is index 1 (18).
	// index 1 --> the greatest element to the right of index 1 is index 4 (6).
	// index 2 --> the greatest element to the right of index 2 is index 4 (6).
	// index 3 --> the greatest element to the right of index 3 is index 4 (6).
	// index 4 --> the greatest element to the right of index 4 is index 5 (1).
	// index 5 --> there are no elements to the right of index 5, so we put -1.
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
