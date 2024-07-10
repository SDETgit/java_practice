package L1_Arrays;
import java.util.Arrays;

public class J029_odd_even_intergers_array {

	public static void main(String[] args) {

		int a[] = {1,2,3,4,5,6,7,8,9,10,11};
		int odd =0;
		int even = 0;
		
			for(int v:a)
			{
				if(v%2==0)
				{
					even++;
				}
				else {
					odd++;
				}
			}
			       System.out.println(" Even count is  "+even+" Odd count is "+odd);
			       
			       
	}
	}

	