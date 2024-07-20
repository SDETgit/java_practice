package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;


public class Q_008_mismatches_array1_array3_suing_collection {

	public static void main(String[] args) {
		 int a [] = {1,2,3,4,5};
		 int b [] = {2,3,1,0,5};
		 HashSet <Integer> s1 = new HashSet<>();
		 HashSet <Integer> s2 = new HashSet<>();
		 
		 for(int v: a )
			 s1.add(v);
		 for(int v:b)
			 s2.add(v);
		 
		 ArrayList<Integer> nonc=new ArrayList<Integer>();
		 
		 for(int v:a)
		 {
		 if(s2.contains(v)==false)
		 {
			 nonc.add(v);
		 }
		 }
		 for(int v:b)
		 {
		 if(s1.contains(v)==false)
		 {
			 nonc.add(v);
		 }
		 }
		 
		 System.out.println(nonc);
	}
}
