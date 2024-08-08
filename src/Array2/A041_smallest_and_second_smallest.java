package Array2;

public class A041_smallest_and_second_smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   int arr[] = {1, 5, -6, 7, 8, -6};
		   int smal = Integer.MAX_VALUE;
		   int smal2 = Integer.MAX_VALUE ;
		 
		
		 for(int i=0;i<arr.length;i++)
		 {
			 
				 if(smal>arr[i])
				 {
					 smal2= smal;
					 smal = arr[i];
					 
				 }
				 
				 				 }
				
			 
			
		 
		 System.out.println(smal+" "+smal2);
		

	}

}
