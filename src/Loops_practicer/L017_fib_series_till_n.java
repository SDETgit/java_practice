package Loops_practicer;

import java.util.Scanner;

public class L017_fib_series_till_n {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :-");
		int n =sc.nextInt();
		int a =0;
		int b =1;
		int c =0;
		System.out.print(a+" "+b+" ");
		for(int i=1;i<=n-2;i++)
		{
			
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
		
	}

}
