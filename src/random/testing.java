package random;

public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] c = {"aa", "aa", "cvd", "cvd", "oiu", "gzw", "oiu"};
		 
		 System.out.print(c[0].equals(c[1]));
		 String s1="javatpoint";  
		 String s2="javatpoint";  
		 String s3="JAVATPOINT";  
		 String s4="python";  
		 System.out.println(s1.equals(s2));//true because content and case is same  
		 System.out.println(s1.equals(s3));//false because case is not same  
		 System.out.println(s1.equals(s4));//false because content is not same  
	}

}
