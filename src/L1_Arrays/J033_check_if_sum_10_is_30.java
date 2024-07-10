package L1_Arrays;
import java.util.Arrays;

public class J033_check_if_sum_10_is_30 {

	public static void main(String[] args) {

			int a[] = {-1,1,2,3,4,5,6,7,8,9,10,11,3,0,10,10};
			int sum =0;
			boolean flag = false;
			for(int v:a)
				{
					if(v==10)
					{
						sum = sum+v;
					}
					
					
					
				}
				
				
			if(sum==30)
			{
				System.out.println("yes sum is 30  "+Arrays.toString(a));
			}
			
			else 
			{
				System.out.println("No sum is not 30  "+Arrays.toString(a));
				
			}
	}
	}

	