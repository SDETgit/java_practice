package L1_Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class J039_longest_subsequence {

	public static void main(String[] args) {

		int nums[] = {49, 1, 3, 200, 2, 4, 70, 5 };
		//return majority element A majority element is an element that appears more than n/2 times where n is the array size
		int curlen=1;
		int maxlen=1;
		Arrays.sort(nums);
		System.out.print(Arrays.toString(nums));
		for(int i=1;i<nums.length;i++)
		{
			
			if(nums[i]==(nums[i-1]+1))
			{
				
				curlen++;
				System.out.println(" value "+nums[i]+" "+(nums[i-1]+1)+" curlen "+curlen);
				
			}
			
			if(nums[i]!=(nums[i-1]+1))
			{
				maxlen=Math.max(curlen,maxlen);
				
			}
		}
		
		System.out.println(maxlen);
			
	}
	}

	