package L1_Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class J036_sum_of_triplets_equals_num {

	public static void main(String[] args) {

			int a[] = {50,20,30,40,50,20,50};
			
			//Approach 1 using hash set it do not allows duplicates 
//			HashSet <Integer> set = new HashSet<Integer>();
//			for(int v:a)
//				set.add(v);
//			
//			System.out.println(set);
//	
	//Approach 2 using loops 
			int dup = 0;
			
			for(int j=0;j<a.length;j++) {
			 for(int i=j+1;i<a.length;i++)
			 {
				 if(a[i]==a[j])
				 {
					 dup++;
					 break;
					 
				 }
			 }
			
			}
			int new1 [] = new int[a.length-dup];
			boolean flag ;
			int k =0;
			for(int l=0;l<a.length;l++)
			{
				flag =false;
				for(int b=l+1;b<a.length;b++)
				{
					if(a[l]==a[b])
					{
						flag = true;
					}
				}
				if(flag == false)
				{
					new1[k] = a[l];
					k++;
				}
			}
			
			System.out.println(Arrays.toString(new1));
	
	}
	}

	