package L1_Arrays;

import java.util.Arrays;

public class J025_equality_of_array {

	public static void main(String[] args) {

		int a [] = {-1,1,2,3,4,5,6,7,-11,9,-12};

		int b [] = {-1,1,2,3,4,5,6,7,-11,9,-12,1};
		boolean flag = false;
		
		if(a.length==b.length){
		for(int i=0;i<a.length;i++)
		{
			
				if(a[i]==b[i])
				{
					flag = true;
					
				}
				else {
					flag = false;
					
				}
		}
		if(flag==true)
		{
			System.out.println("Arrays are equal \n" +"A="+Arrays.toString(a)+"\n"+"B="+Arrays.toString(b));
		}
		else 
		{
			System.out.println("Arrays are not equal \n" +"A="+Arrays.toString(a)+"\n"+"B="+Arrays.toString(b));
		}
		}
		else {
			System.out.println("Arrays are not equal \n" +"A="+Arrays.toString(a)+"\n"+"B="+Arrays.toString(b));
		}
		
		//Using function inbuild
		System.out.println(Arrays.equals(a,b));
			
			
	}}

	