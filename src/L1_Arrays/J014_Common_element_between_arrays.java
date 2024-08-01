package L1_Arrays;

import java.util.Arrays;

public class J014_Common_element_between_arrays {
	public static void main(String[] args) {
		 String[] a = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
	
		for (int i = 0;i<a.length;i++)
		{
			for(int j=i+1 ;j<a.length;j++)
			{
				
				
				if(a[j].toLowerCase().equals(a[i].toLowerCase()))
				{
					System.out.println(a[j] +"  "+i);
				}
			}
		}
		}

}
