package Loops_practicer;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class L020_guess_randon_number_game {
	//Write a program that generates a random number and asks the user to guess what the number is. If the user's
	// guess is higher than the random number, the program should display "Too high, try again." If the user's 
	// guess is lower than the random number, the program should display "Too low, try again." The program should 
	// use a loop that repeats until the user correctly guesses the random number.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int rn = r.nextInt(10,99);
	//	System.out.println(rn);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number ");
		int num = 0;
		do {
			 num = sc.nextInt();
			if(num==rn)
			{
				System.out.println("You have successfully guessed the number "+num+" "+rn);
			}
			else if (num <rn)
			{
				System.out.println("Number enteres is smaller Enter again ");
			}
			else if (num > rn)
			{
				System.out.println("Number enteres is bigger enter again ");
			}
			
		}while (num!=rn);
		
	}

}
