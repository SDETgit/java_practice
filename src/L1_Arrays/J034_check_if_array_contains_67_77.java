package L1_Arrays;

import java.util.Arrays;

public class J034_check_if_array_contains_67_77 {

	public static void main(String[] args) {

			int a[] = {-1,1,2,3,4,5,6,7,8,9,10,11,3,0,10,10,67,77};
			
			boolean flag67 = false;
			boolean flag77 = false;
			for(int c:a)
			{
				if(c==67)
				{
					flag67 = true;
				}
				
				if(c==77)
				{
					flag77=true;
				}
			}
			
			if(flag67==true&&flag77==true)
			{
				System.out.println("Yes array contains both 67 and 77"+Arrays.toString(a));
			}
			else if(flag67==true&&flag77==false)
			{
				System.out.println("Yes array contains 67 and not 77"+Arrays.toString(a));
			}
			else if(flag67==false&&flag77==true)
			{
				System.out.println("Yes array contains 77 and not 67"+Arrays.toString(a));
			}
			else
			{
				System.out.println("Yes array does not contains both 67 and 77"+Arrays.toString(a));
			}
	}
	}

	