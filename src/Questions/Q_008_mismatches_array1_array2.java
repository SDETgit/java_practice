package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;


public class Q_008_mismatches_array1_array2 {

	public static void main(String[] args) {
		 int a [] = {1,2,3,4,5};
		 int b [] = {2,3,1,0,5};
		 Boolean flag;
		 System.out.println("sdsd");
		 for(int i=0;i<a.length;i++)
		 {
			 flag = false;
			 for(int j=0;j<b.length;j++)
			 {
				 if(a[i]==b[j])
				 {
					 flag = true;
					 break;
				 }
				 
			 }
			 if(flag==false)
			 {
				 System.out.println(a[i]);
			 }
			 
		 }
		 
		 for(int i=0;i<b.length;i++)
		 {
			 flag = false;
			 for(int j=0;j<a.length;j++)
			 {
				 if(a[i]==b[j])
				 {
					 flag = true;
					 break;
				 }
				 
			 }
			 if(flag==false)
			 {
				 System.out.println(b[i]);
			 }
	    
	}
	}
}
