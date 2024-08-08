package Loops_practicer;

import java.util.Scanner;

public class L009_reverse_number {
	
	//Write a program that prompts the user to input a positive integer. 
	//It should then print the multiplication table of that number. 	
//https://www.beginwithjava.com/java/loops/questions.html
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int num = sc.nextInt();
		System.out.println("Enter another number ");
		int num2 = sc.nextInt();
		
		int pow = 1;
		for(int i=1;i<=num2;i++)
		{
			pow = pow*num;
			if(i<num2)
			System.out.print(num+"*");
			if(i==num2)
				System.out.println(num);
			
		}
		System.out.println(pow);
		
	}

}
