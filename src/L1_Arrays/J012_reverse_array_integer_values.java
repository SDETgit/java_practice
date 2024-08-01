package L1_Arrays;

import java.util.Arrays;

public class J012_reverse_array_integer_values {
	public static void main(String[] args) {
		int a [] = {1,2,4,55,667,875,91,-1,-2};
	
		int temp =0;
		for(int i =0;i<=(a.length-1)/2;i++)
		{
			temp = a[i];
			a[i] = a[a.length-1-i];
			a[a.length-1-i] = temp;
			
			System.out.println("Value of temp " +temp+" a[i] "+" a[a.length-1] "+a[a.length-1]);
		}
		
		System.out.print(Arrays.toString(a));
	}

}
