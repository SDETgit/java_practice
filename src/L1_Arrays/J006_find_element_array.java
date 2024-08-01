package L1_Arrays;
public class J006_find_element_array {
	public static boolean contains(int arr[] , int item) {
		
		for(int a:arr)
		{
			if(a==item)
			{
				return true;
			}
		}
		
		return false ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] my_array1 = {
	            1789, 2035, 1899, 1456, 2013, 
	            1458, 2458, 1254, 1472, 2365, 
	            1456, 2165, 1457, 2456
	        };
		
		int a = 2456;
		
		for(int i=0;i<my_array1.length;i++)
		{
			if(my_array1[i]==a)
			{
				System.out.println("Element is present in array at "+i+" element is "+my_array1[i]);
				break;
			}
		}
		
		System.out.print(contains(my_array1,a));
	}

}
