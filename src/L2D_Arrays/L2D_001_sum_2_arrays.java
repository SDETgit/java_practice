package L2D_Arrays;

public class L2D_001_sum_2_arrays {
	public static void main(String[] args) {
	 int[][] a     = { { 3, 2, 7 }, { 2, 6, 8 }, { 5, 1, 9 } };
	 int[][] a2      = { { 3, 2, 7 }, { 2, 6, 8 }, { 5, 1, 9 } };
	 
	 for(int i=0 ;i<a.length;i++)
	 {
		 for(int j=0;j<a[0].length;j++)
		 {
			  a[i][j] = a[i][j] + a2[i][j];
		 }
	 }
	   for(int c[] : a)
	   {
		   for(int el :c)
		   {
			   System.out.print(el+" ");
		   }
	   }
	}
}
