package random;

public class R002_first_non_repetive_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {1,1,2,3,2,4,5};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				System.out.println("Value i> "+i+" < Value for j> "+j+" Value from array at a[i] "+a[i]+" Value from array a[j] > ");
			}
		}
	}

}
