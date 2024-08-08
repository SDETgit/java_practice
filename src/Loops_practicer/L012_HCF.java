package Loops_practicer;

import java.util.Scanner;

public class L012_HCF {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1 ");
		int nm1 = sc.nextInt();
		System.out.println("Enter number 2 ");
		int nm2 = sc.nextInt();
		
		if(nm1==0||nm1==1||nm2==0||nm2==1) {
			System.out.println("Number should be greater than 1");
		}
		
		int HCF =0;
		if(nm1>=2)
		{
			for(int i=1;i<=Math.min(nm1, nm2);i++)
			{
				if(nm1%i==0&&nm2%i==0)
				{
					HCF =i;
				}
				
			}
		}
		
		System.out.println(HCF);
	

	}

}
