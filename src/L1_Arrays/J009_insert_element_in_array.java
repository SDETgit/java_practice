package L1_Arrays;

import java.util.Arrays;

public class J009_insert_element_in_array {
	public static void main(String[] args) {
		 int a[] = {1789, 2035, 1899, 1456, 2013, 
                 1458, 2458, 1254, 1472, 2365, 
                 1456, 2165, 1457, 2456};
      
      int c = 3; // Index at which to insert the element
      int newValue = 3; // Value to be inserted
      
      // Create a new array with one extra space
      int b[] = new int[a.length + 1];
      
      // Copy elements from a to b, inserting newValue at index c
      for (int i = 0, k = 0; i < b.length; i++) {
          if (i == c) {
              b[i] = newValue;
              
              System.out.println("Value of i inside if " + i );
          } else {
              b[i] = a[k];
              System.out.println("Value of i inside else " + i +" and k "+k );
              k++;
          }
      }
		
		 
		 for (int i = 0; i < b.length; i++) {
	            System.out.print(b[i] + " ");
	        }
	        System.out.println();
	}

}
