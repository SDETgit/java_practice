package L1_Arrays;
/*
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -
*/
public class J004_printgrid {

	public static void main(String[] args) {
		System.out.println("Printing grid \n"
				+ "- - - - - - - - - -                                                                                           \r\n"
				+ "- - - - - - - - - -                                                                                           \r\n"
				+ "- - - - - - - - - -                                                                                           \r\n"
				+ "- - - - - - - - - -                                                                                           \r\n"
				+ "- - - - - - - - - -                                                                                           \r\n"
				+ "- - - - - - - - - -                                                                                           \r\n"
				+ "- - - - - - - - - -                                                                                           \r\n"
				+ "- - - - - - - - - -                                                                                           \r\n"
				+ "- - - - - - - - - -                                                                                           \r\n"
				+ "- - - - - - - - - -");
		
		/*
		 * for(int i=0;i<10;i++) { System.out.println("- - - - - - - - - -"); }
		 */
		System.out.println("Printing pattern ");
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++) {
			System.out.print("-"+" ");
			
			}
			System.out.println();
		}
		
		
	}
}
