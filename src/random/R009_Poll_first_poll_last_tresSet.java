package random;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Stack;
import java.util.TreeSet;

public class R009_Poll_first_poll_last_tresSet {
	 

	public static void main(String[] args) {
		 TreeSet<Integer> set = new TreeSet<>();
	        set.add(1000);
	        set.add(20);
	        set.add(3030);
	        set.add(40);

	        // Print the original set
	        System.out.println("Original set: " + set);

	        // Poll the first (lowest) element
	        Integer firstElement = set.pollFirst();
	        System.out.println("First element polled: " + firstElement);
	        System.out.println("Set after polling first element: " + set);

	        // Poll the last (highest) element
	        Integer lastElement = set.pollLast();
	        System.out.println("Last element polled: " + lastElement);
	        System.out.println("Set after polling last element: " + set);
	        
	        
	        String[] array1 = {"apple", "banana", "cherry"};
	        String[] array2 = {"apple", "banana", "cherry"};
	        String[] array3 = {"apple", "banana", "date"};
	        
	        int result1 = Arrays.compare(array1, array2);

	        int result2 = Arrays.compare(array2, array3);

	        int result3 = Arrays.compare(array3, array1);
	        
	        // Compare array1 and array3
	        System.out.println("Comparing array1 and array2: " + result1); // Output: 0

	        // Compare array1 and array3
	      
	        System.out.println("Comparing array1 and array3: " + result2); // Output: -1

	        // Compare array3 and array1
	        
	        System.out.println("Comparing array3 and array1: " + result3); // Output: 1
	        
	        int [] num = new int[5];
			System.out.println(Arrays.toString(num));
			num[0] =9;
			System.out.println(Arrays.toString(num));
			Arrays.fill(num, 4);
			System.out.println(Arrays.toString(num));
			
    	    
}
}
