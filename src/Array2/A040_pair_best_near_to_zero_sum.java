package Array2;

public class A040_pair_best_near_to_zero_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   int arr[] = {1, 5, -4, 7, 8, -6};
		   int min = Integer.MAX_VALUE;
		   int sum = Integer.MAX_VALUE ;
		 
		 boolean flag;
		 for(int i=0;i<arr.length;i++)
		 {
			 flag = false;
			 for(int j=0;j<arr.length;j++)
			 {
				 if(i!=j) {
				sum = arr[i]+arr[j];
				int a = Math.abs(min);
				int b = Math.abs(sum);
				min = Math.min(a, b);
				
				 }
				
			 }
			
		 }
		 
		 System.out.println(min);
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 for(int j=i+1;j<arr.length;j++)
			 {
				 if( Math.abs(arr[i]+arr[j])==1)
				 {
				System.out.println(arr[i]+" "+arr[j]+" Index "+i+" index "+j);	 
				 }
			 }
		 }

	}

}
