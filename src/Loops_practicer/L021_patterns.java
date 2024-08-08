package Loops_practicer;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class L021_patterns {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//**********
		//**********
		//**********
		//**********
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<10;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//*
		//**
		//***
		//****
		//*****
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
//	 	  *
	//   **
	//  ***
	// ****
	//*****
		int row =5;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<row-i-1;j++)
			{
				System.out.print(" ");
			}
			for(int k = 0 ;k<=i;k++)
			{System.out.print("*");
			
			}
			
			System.out.println();
			
		}
		
 // 	  *
	//   ***
	//  *****
	// *******
	//*********
		int rows = 9;
		
		for(int i=0;i<=rows/2;i++)
		{
			for(int j=0;j<rows/2-i;j++)
				System.out.print(" ");
			for(int k=0;k<i*2+1;k++)
				System.out.print("*");
			
			System.out.println();
			

		}
//		  1
	//   222
	//  33333
	// 4444444
	//555555555
		
		int num = 5 ; 
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<num-i-1;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=0;k<i*2+1;k++)
			{
				System.out.print(i+1);
			}
			System.out.println();
		}
		
//		  1
	//   212
	//  32123
	// 4321234
	//543212345
		
		int row1 = 5;
		for(int i=1;i<=5;i++)
		{
			for(int j=0;j<row1-i;j++)
			{
				System.out.print(" ");
			}
			 // Print decreasing sequence
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // Print increasing sequence
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            } 
            
			
			System.out.println();
		}
		
	}

}
