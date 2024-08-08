package Loops_practicer;

public class L001_loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [] = {10,20,30,40};
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.println("Value of a[i] :-" +a[i]+ " Value of a[j] " + a[j] + " i "+ i + " j "+j);
			}
			System.out.println();
		}
		//Value of a[i] :-10 Value of a[j] 10 i 0 j 0
		//Value of a[i] :-10 Value of a[j] 20 i 0 j 1
		//Value of a[i] :-10 Value of a[j] 30 i 0 j 2
		//Value of a[i] :-10 Value of a[j] 40 i 0 j 3
		//
		//Value of a[i] :-20 Value of a[j] 10 i 1 j 0
		//Value of a[i] :-20 Value of a[j] 20 i 1 j 1
		//Value of a[i] :-20 Value of a[j] 30 i 1 j 2
		//Value of a[i] :-20 Value of a[j] 40 i 1 j 3
		//
		//Value of a[i] :-30 Value of a[j] 10 i 2 j 0
		//Value of a[i] :-30 Value of a[j] 20 i 2 j 1
		//Value of a[i] :-30 Value of a[j] 30 i 2 j 2
		//Value of a[i] :-30 Value of a[j] 40 i 2 j 3
		//
		//Value of a[i] :-40 Value of a[j] 10 i 3 j 0
		//Value of a[i] :-40 Value of a[j] 20 i 3 j 1
		//Value of a[i] :-40 Value of a[j] 30 i 3 j 2
		//Value of a[i] :-40 Value of a[j] 40 i 3 j 3

	}

}
