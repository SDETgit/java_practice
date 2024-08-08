package Loops_practicer;

import java.text.DecimalFormat;
import java.util.Scanner;

public class L019_logarithmic_sum {
	//Compute the natural logarithm of 2, by adding up to n terms in the series
	//1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n
	//where n is a positive integer and input by user
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0;
		int n =122222222;
		for(double i=1;i<=n;i++)
		{
			if(i%2==0)
			sum = sum-1/i;
			else 
				sum=sum+1/i;
		
		}
		 DecimalFormat f = new DecimalFormat("0.0000000");//it will also round it off 
		System.out.println(f.format(sum));
		System.out.printf("Number is approximately %.3f", sum); //it will also round it off 
	}

}
