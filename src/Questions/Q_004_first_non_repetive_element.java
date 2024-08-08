package Questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;


public class Q_004_first_non_repetive_element {

	public static void main(String[] args) {

		int a [] = {1,1,2,3,2,4,3,5};
		Arrays.sort(a);
		boolean flag;
		for(int i=0;i<a.length-1;i++)
		{
			flag = false;
			for(int j=0;j<a.length;j++)
			{
				if(i!=j&&a[i]==a[j])
				{
					flag = true;
					break; 
				}
			}
			if(flag == false )
			{
				System.out.println(a[i]);
				break;
			}
		}
	}
	
}
