package Loops_practicer;

import java.util.Scanner;

public class L013_Calculator_till_user_terminates_it {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 long  number1,number2;
		char c = 0;
		
		do {
			System.out.println("Enter number 1");
			number1 = sc.nextInt();
			System.out.println("Enter number 2");
			number2 = sc.nextInt();
			long sum = 0;
			sum = number1+number2;
			System.out.println(sum);
			System.out.println("Want to continue enter Y else N ?");
			c = sc.next().charAt(0);

		}while(c=='y'||c=='Y');
	

	}

}
