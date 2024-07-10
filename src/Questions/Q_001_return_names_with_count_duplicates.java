package Questions;

import java.util.HashMap;
import java.util.Map;

public class Q_001_return_names_with_count_duplicates {
	public static void main(String[] args) {
		String a[] = {"Ram","Bea","Bea","Ram","Sam"}; //output Ram2 Bea 2 Sam1	
		/*
		 * int count=1; for(int i=0;i<a.length;i++) { count=1; for(int
		 * j=i+1;j<a.length;j++) { if(a[i].equals(a[j])) { count++; break; } }
		 * System.out.println(a[i]+count); }
		 */
		HashMap<String, Integer> hm = new HashMap<>();
		for(String v:a){
			if(hm.containsKey(v)==false)
			{
				hm.put(v, 1);
			}
			else {
				hm.put(v, hm.get(v)+1);
			}
		}
		
		System.out.println(hm);

		for(Map.Entry m: hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}
	
}
