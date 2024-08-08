package Loops_practicer;

public class L004_Write_a_program_to_print_numbers_from_1_to_10 {
	
	public static void print2(int temp,int temp2) {
		if(temp<=temp2) {
		System.out.println(temp++);
		print2(temp,temp2);}
	}
//https://www.beginwithjava.com/java/loops/questions.html
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=1;i<11;i++)
		{
				System.out.print(i+" ");
		}
		 
		int temp =1;
		while (temp<11)
		{
			System.out.print(temp+" ");
			temp++;
		}
		int temp1 = 1;
		
		do {
			System.out.print(temp1+" ");
			temp1++;
		}while (temp1 <11);
		
		print2(10, 20);
		
	}

}
