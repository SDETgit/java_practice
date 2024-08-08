package Loops_practicer;

import java.text.DecimalFormat;
import java.util.Scanner;

public class L018_sum_of_series {
	//Write a program to calculate the sum of following series where n is input by user. 
	//1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0;
		int n =2000002;
		for(double i=1;i<=n;i++)
		{
			sum = sum+1/i;
			System.out.println(sum);
		}
		 DecimalFormat f = new DecimalFormat("0.000");//it will also round it off 
		System.out.println(f.format(sum));
		System.out.printf("Number is approximately %.3f", sum); //it will also round it off 
	}

}
