package L1_Arrays;

public class J5_average {
	public static void main(String[] args) {
		double a[] = {1,2,3,4,5,6,7,8,9};
		double sum = 0;
		for(int i=0;i<a.length;i++) {
			sum = sum+a[i];
		}
		
		System.out.println("Average is "+sum/a.length);
	}
}
