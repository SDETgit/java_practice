package L1_Arrays;

import java.util.Arrays;
import java.util.Collections;

public class J003_sort_arrays_string_int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] my_array1 = {
	            1789, 2035, 1899, 1456, 2013, 
	            1458, 2458, 1254, 1472, 2365, 
	            1456, 2165, 1457, 2456
	        };
		
		 String[] my_array2 = {
		            "Java",
		            "Python",
		            "PHP",
		            "C#",
		            "C Programming",
		            "C++"
		        }; 
		 
		 String[] countries = {"Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", " Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"}; 
		 
		 System.out.println("Array before sorting :- "+Arrays.toString(my_array1));
		 Arrays.sort(my_array1);
		 
		 System.out.println("Array after sorting :- "+Arrays.toString(my_array1));
		 
		 
		 System.out.println("Array before sorting :- "+Arrays.toString(my_array2));
		 Arrays.sort(my_array2);
		 
		 System.out.println("Array after sorting :- "+Arrays.toString(my_array2));
		 System.out.println("Array before sorting :- "+Arrays.toString(countries));
		 Arrays.sort(countries);
		 
		 System.out.println("Array after sorting :- "+Arrays.toString(countries));
		 
		 //to sort in reverse order 
		 Arrays.sort(countries, Collections.reverseOrder());
		

		 System.out.println("Array after sorting reverse order :- "+Arrays.toString(countries));
		 
		 //Sorting array without using inbuild funtion 
		 int[] arr = {
         1789, 2035, 1899, 1456, 2013, 
         1458, 2458, 1254, 1472, 2365, 
         1456, 2165, 1457, 2456
     };
		 int temp=0;
		 for(int i=0;i<arr.length;i++)
		 {
			 for(int j = i+1;j<arr.length;j++)
			 {
				 if(arr[j]>arr[i])
				 {
					 temp= arr[i];
					 arr[i] = arr[j];
					 arr[j] =temp;
				 }
			 }
		 }
		 
		 System.out.println(Arrays.toString(arr));
		 
		 String[] count = {"Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", " Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"}; 
			String temp1;

			 System.out.println("Before sorting:-"+Arrays.toString(count));
		 for(int i=0;i<count.length;i++)
		 {
			 for(int j= i+1;j<count.length;j++)
			 {
				// System.out.print(count[i]+" "+count[j]+" ");
				 //System.out.print(count[i].compareTo(count[j])+"\n");
				 if(count[i].compareTo(count[j])>0)
				 {
					temp1=count[i];
					count[i]= count[j];
					count[j]=temp1;
				 }
				 
				 
				 
			 }
		 }
		 
		 System.out.println("After sorting:- "+Arrays.toString(count));
		 
			
	}

}
