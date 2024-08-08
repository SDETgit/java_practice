package Array2;

public class A039_leaders_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int arr[] = {10, 9, 14, 23, 15, 0, 9};
		 
		 boolean flag;
		 for(int i=0;i<arr.length;i++)
		 {
			 flag = false;
			 for(int j=i+1;j<arr.length;j++)
			 {
				 if(arr[i]<arr[j])
				 {
					 flag=true;
					
				 }
				 
			 }
			 if(flag==false)
			 {
				 System.out.println("Leader is :- " +arr[i]+"at index :-"+i);
			 }
		 }

	}

}
