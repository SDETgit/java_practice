package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;


public class Q_009_Roman_to_int {

	public static void main(String[] args) {
		String s = "XCVIII";
		int nums[] = new int[s.length()];
		for(int i=0;i<nums.length;i++)
		{
			switch(s.charAt(i)) {
			
			case 'M' : nums[i]  =1000;
			break;

			case 'D' : nums[i]  =500;
			break;

			case 'C' : nums[i]  =100;
			break;

			case 'L' : nums[i]  =50;
			break;

			case 'X' : nums[i]  =10;
			break;

			case 'V' : nums[i]  =5;
			break;

			case 'I' : nums[i]  =1;
			break;
			}
		}
		
		int sum =0;
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i]<nums[i+1])
				sum=sum-nums[i];
			else 
				sum+=nums[i];
		}
		
		System.out.println(sum+nums[nums.length-1]);
		
	}
}
