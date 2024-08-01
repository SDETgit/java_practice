package L1_Arrays;

public class J011_min_array {
	public static void main(String[] args) {
		int a [] = {1,2,4,55,667,875,91,-1};
		
//		int min =a[0];
//		
//		for(int c:a)
//		{
//			if(c<min)
//			{
//				min =c;
//			}
//			
//			
//		}
//		System.out.println(min);

		
		int min = a[0];
		int max = a[0];
		
		for(int c:a)
		{
			if(c<min)
			{
			min = c;	
			}
			if(c>max)
			{
				max =c;
			}
		}
		
		System.out.println(min+" "+max);
	}
}
