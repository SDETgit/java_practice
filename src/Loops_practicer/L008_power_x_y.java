package Loops_practicer;

import java.util.Scanner;

public class L008_power_x_y {
	
	//Write a program that prompts the user to input a positive integer. 
	//It should then print the multiplication table of that number. 	
//https://www.beginwithjava.com/java/loops/questions.html
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int num = sc.nextInt();
		
		int rem =0;
		int sum = 0;
		while(num>=1)
		{
			rem = num%10;
			sum = sum+rem;
			if(num>1)
			sum = sum*10;
			num=num/10;
		}
		
		System.out.println(sum);
		
	}

}
