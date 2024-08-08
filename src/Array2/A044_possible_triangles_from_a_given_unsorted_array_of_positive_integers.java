package Array2;

import java.util.Arrays;

public class A044_possible_triangles_from_a_given_unsorted_array_of_positive_integers {
//Note: The triangle inequality states that the sum of the lengths of any two sides of a 
	//triangle must be greater than or equal to the length of the third side.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int nums[] = {6, 7, 9, 16, 25, 12, 30, 40};
		  int  count=0;
		  for(int i=0;i<nums.length;i++) {
			  for(int j=i+1;j<nums.length;j++) {
				  for(int k=j+1;k<nums.length;k++)
				  {
					  if((nums[i]+nums[j])>nums[k])
					  {
						  System.out.println(nums[i]+" "+nums[j]+" "+nums[k]);
						  count++;
					  }
				  }
			  }
		  }
System.out.println("Number of triangles are "+count);
	}

}
