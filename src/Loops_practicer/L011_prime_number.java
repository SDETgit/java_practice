package Loops_practicer;

import java.util.Scanner;

public class L011_prime_number {
	
	//Write a program that prompts the user to input a positive integer. 
	//It should then print the multiplication table of that number. 	
//https://www.beginwithjava.com/java/loops/questions.html
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int nm = sc.nextInt();
		
		if(nm==0||nm==1) {
			System.out.println("Not a prime number ");
		}
		
		int count =0;
		if(nm>2)
		{
			for(int i=2;i<=nm/2;i++)
			{
				if(nm%i==0)
				{
					count++;
				}
				
			}
		}
		
		if(count==0)
		{
			System.out.println("Prime");
		}
		else 
			System.out.println("not prime ");
	

	}

}
