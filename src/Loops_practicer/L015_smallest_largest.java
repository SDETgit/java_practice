package Loops_practicer;

import java.util.Scanner;

public class L015_smallest_largest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 char c =0;
		int nm;
		int smal=Integer.MAX_VALUE;
		int largest = Integer.MIN_VALUE;
		do {
			System.out.println("Enter number ");
			nm = sc.nextInt();
			if(nm>largest )
			{
				largest = nm;
			}
			if(nm<smal )
			{
				smal = nm;
			}
			System.out.println("Do you want to continue enter Y else N ?");
			c = sc.next().charAt(0);

		}while(c=='y'||c=='Y');
	
		System.out.println("small numbers are "+smal);

		System.out.println("large numbers are "+largest);

		
	}

}
