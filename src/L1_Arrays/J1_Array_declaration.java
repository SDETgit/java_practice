package L1_Arrays;

import java.util.Arrays;

public class J1_Array_declaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[5]; //Declaration and instantiation 
		a[0] =2;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
		//Declaration and instantiation and initialisation 
		int b[] = {1,2,3,4,5,6,7,8};  
		
		System.out.println(Arrays.toString(b));
		
		for(int i:b)
		{
			System.out.print(i+" ");
		}
	}

}
