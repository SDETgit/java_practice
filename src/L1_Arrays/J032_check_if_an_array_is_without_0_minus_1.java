package L1_Arrays;
import java.util.Arrays;

public class J032_check_if_an_array_is_without_0_minus_1 {

	public static void main(String[] args) {

			int a[] = {1,2,3,4,5,6,7,8,9,10,11,3,0};
			
			boolean flag0 = false;

			boolean flag1 = false;
			for(int v:a)
				{
					if(v==0)
					{
						flag0 = true;
					}
					if(v==-1)
					{
						flag1 = true;
					}
					
					
				}
				
				
			if(flag0==true&&flag1==true)
			{
				System.out.println("Array is  having 0 and -1 "+Arrays.toString(a));
			}
			
			else if(flag0==true&&flag1==false)
			{
				System.out.println("Array is  having 0 and but not having -1 "+Arrays.toString(a));
				
			}
			else if(flag0==false&&flag1==true)
			{
				System.out.println("Array is  having 0 and but not having -1 "+Arrays.toString(a));
				
			}
			else 
			{
				System.out.println("Array is  not having 0 and -1 "+Arrays.toString(a));
				
			}
	}
	}

	