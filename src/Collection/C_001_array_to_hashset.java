package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class C_001_array_to_hashset {
	public static void main(String[] args) {
		Integer arr[] = {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42,42,92,36};
		 HashSet<Integer> set=new HashSet();  
		 
		
		 
		 for(Integer a:arr)
		 {
			 set.add(a);
		 }
		// Collections.s(set);//we cannot sort hashset directly we need to convert it to other 
		 
		 System.out.println(set);
		 TreeSet myTreeSet = new TreeSet();
		 myTreeSet.addAll(set);
		 
		 System.out.println(myTreeSet);
		 
	}
}
