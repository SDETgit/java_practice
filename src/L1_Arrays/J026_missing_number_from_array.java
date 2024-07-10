package L1_Arrays;
import java.util.Arrays;

public class J026_missing_number_from_array {

	public static void main(String[] args) {

		int a [] = {1,2,3,4,5,6,7,8,9,11};
		int n = a.length+1;
		int sum = n*(n+1)/2;
		System.out.println(sum);

		for(int i:a)
		{
			sum = sum -i;
		}
			System.out.println("missing number is "+sum);
			
	}}

	