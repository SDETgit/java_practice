package Loops_practicer;

import java.util.Scanner;

public class L007_factorial {
	
	//Write a program that prompts the user to input a positive integer. 
	//It should then print the multiplication table of that number. 	
//https://www.beginwithjava.com/java/loops/questions.html
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int num = sc.nextInt();
		int fact = 1;
		/*
		 * while(num>=2) { fact=fact*num--; System.out.printf("%d*",num); }
		 * System.out.println("= "+fact);
		 */
		int fact1 =1;
		for(int i=num;i>=1;i--)
		{
			fact1=fact1*i;
			if(i>1) {
			System.out.print(i+"*");}
			else 
				System.out.println(i);
		}
		System.out.println(fact1);
		
	}

}
