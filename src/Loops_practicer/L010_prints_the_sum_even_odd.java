package Loops_practicer;

import java.util.Scanner;

public class L010_prints_the_sum_even_odd {
	
	//Write a program that prompts the user to input a positive integer. 
	//It should then print the multiplication table of that number. 	
//https://www.beginwithjava.com/java/loops/questions.html
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int nm = sc.nextInt();
		
		int sume =0;
		int sumo =0;
		int rem = 0;
		while(nm>0)
		{
			rem = nm%10;
			if(rem%2==0)
			{
				sume=sume+rem;
			}
			else 
				sumo+=rem;
			nm = nm/10;
		}
		
		System.out.println(sume+" "+sumo);
	

	}

}
