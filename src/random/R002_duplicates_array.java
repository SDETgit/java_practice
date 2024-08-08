package random;

import java.util.Arrays;
import java.util.HashSet;

public class R002_duplicates_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {1,1,2,3,4,4,5,99,77,88,77};
		HashSet hs = new HashSet();
		
		for(int v:a)
			hs.add(v);
		
		System.out.println(hs);
	}
}
