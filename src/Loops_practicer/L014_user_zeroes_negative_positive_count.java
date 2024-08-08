package Loops_practicer;

import java.util.Scanner;

public class L014_user_zeroes_negative_positive_count {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 char c =0;
		int nm;
		int neg =0;
		int pos=0;
		int zero=0;
		do {
			System.out.println("Enter number ");
			nm = sc.nextInt();
			if(nm<0)
			{
				neg++;
			}
			else if(nm>0)
			{
				pos++;
			}
			
			else zero++;
			System.out.println("Do you want to continue enter Y else N ?");
			c = sc.next().charAt(0);

		}while(c=='y'||c=='Y');
	
		System.out.println("Positive numbers are "+pos);

		System.out.println("Negative numbers are "+neg);

		System.out.println("zero numbers are "+zero);
	}

}
