package L1_Arrays;

public class J010_max_array {
	public static void main(String[] args) {
		int a [] = {1,2,4,55,667,875,91};
		
		int max =a[0];
		
		for(int c:a)
		{
			if(c>max)
			{
				max =c;
			}
			
			
		}
		System.out.println(max);
		
	}
}
