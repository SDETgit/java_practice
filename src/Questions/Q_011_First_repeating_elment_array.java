package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;


public class Q_011_First_repeating_elment_array {

	public static void main(String[] args) {
		int a[] = {17,17,9,4,2,7,8};
		boolean flag;
		for(int i=0;i<a.length;i++)
		{
			flag =false;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
					flag =true;
					break;
				}
				
				
			}
			if(flag==true) {
				break;
			}
			
		}
	}
}
