package Loops_practicer;

import java.util.Scanner;

public class L016_all_armsstrong_numbers {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//All Armstrong  numbers between 1 and 500 
		for(int i=1;  i<=121121;i++)
		{	int eye = i;
			int sum = 0;
			String a = String.valueOf(i);
			int digits = a.length();
			while (eye>0)
			{
			int rem =0;
			
			
			rem = eye%10;
			sum = (int) (sum + Math.pow(rem, digits));
			eye = eye/10;
			}
			if(sum==i)
			{
				System.out.print(i+" ");
			}
		}
		
	}

}
