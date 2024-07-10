package L1_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class J037_longest_sequence_in_array {

	public static void main(String[] args) {

		//int[] nums = {100, 4, 200, 1, 3, 2};
		int [] nums = {49, 1, 3, 200, 2, 4, 70, 5};
		
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		int currlen=1;
		int maxlen=1;
		for(int i=0;i<nums.length-1;i++)
		{
			if(nums[i]==nums[i+1]-1)
			{
				currlen++;
			}
			else if(nums[i]!=nums[i+1]) {
				maxlen = Math.max(maxlen,currlen);
				currlen=1;
				
			}
		}
		
		System.out.println(maxlen);
		
		//Array contains duplicates 
		int [] nums2 = {49, 1, 3, 200, 2, 4, 70, 5,5,1,3};
		HashSet set = new HashSet();
		for(int a: nums2)
			set.add(a);
		
		List<Integer> li = new ArrayList<Integer>(set);
		Collections.sort(li);
		int curlen1=1;
		int maxlen1 =1;
		for(int i=1;i<li.size()-1;i++)
		{
			  if (li.get(i) == li.get(i - 1) + 1) 
			{
				curlen1++;
			}
			  if(li.get(i) != li.get(i - 1) + 1)	
				  {
				  maxlen1 = Math.max(maxlen1, curlen1);
				  }
			}
		
		System.out.println(li+" "+maxlen1);;
	
	}
	}

	