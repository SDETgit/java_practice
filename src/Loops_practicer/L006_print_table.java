package Loops_practicer;

import java.util.Scanner;

public class L006_print_table {
	
	//Write a program that prompts the user to input a positive integer. 
	//It should then print the multiplication table of that number. 	
//https://www.beginwithjava.com/java/loops/questions.html
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter positive number ");
		 int num = sc.nextInt();
		 
		 for(int i=1;i<=10;i++)
		 {
			 System.out.printf(" %d*%d = %d \n",num,i,num*i);
			 
		 }
		
	}

}
