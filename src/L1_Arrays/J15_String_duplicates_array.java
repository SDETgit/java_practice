package L1_Arrays;

import java.util.Arrays;

public class J15_String_duplicates_array {
	public static void main(String[] args) {
		  	String[] a = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
	        String[] b = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};
	
		for (int i = 0;i<a.length;i++)
		{
			for(int j=0 ;j<b.length;j++)
			{
				
				
				if(a[i].toLowerCase().equals(b[j].toLowerCase()))
				{
					System.out.println(a[i] );
				}
			}
		}
		}

}
