package random;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class R004_first_non_repetiting_element {
	 

	public static void main(String[] args) {
			int a [] = {2,2,3,3,4,5,6,7,4,5};
			boolean flag ;
			for(int i=0;i<a.length;i++)
			{
				flag =false;
				for(int j=0;j<a.length;j++)
				{
					if(i!=j&&a[i]==a[j])
					{
						flag = true;
						break;
					}
				}
				
				if(flag==false)
				{
					System.out.println(a[i]);
					break;
				}
			}
	}
}
