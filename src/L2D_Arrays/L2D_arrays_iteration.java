package L2D_Arrays;

import java.util.Arrays;

public class L2D_arrays_iteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] arr
         = { { 3, 2, 7 }, { 2, 6, 8 }, { 5, 1, 9 } };
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 for(int j=0 ;j<arr[0].length;j++)
			 {
				 System.out.print(arr[i][j]+" ");
			 }
			 System.out.println();
		 }
		 System.out.print(Arrays.deepToString(arr));

	}

}
