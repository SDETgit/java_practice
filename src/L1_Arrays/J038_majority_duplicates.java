package L1_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class J038_majority_duplicates {

	public static void main(String[] args) {

		int a[] = { 1, 6, 6, 5, 7, 4, 1, 7, 7, 7, 7, 7, 7, 7, 2 };
		int n = a.length/2;
		int maxlen =1;
		int curlen =1;
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		for(int i=1;i<a.length-1;i++)
		{
			if(a[i]==a[i-1])
			{
				curlen++;
			}
			else 
			{
				maxlen = Math.max(maxlen, curlen);
				curlen =1;
			}
			
			
		}
		maxlen = Math.max(maxlen, curlen);
		
		System.out.println(maxlen);
	}
	}

	