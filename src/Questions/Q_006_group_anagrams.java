package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;


public class Q_006_group_anagrams {

	public static void main(String[] args) {
		 String[] inputStrings = {"eat", "tea", "tan", "ate", "nat", "bat"};
	        System.out.println("Input Strings: " + Arrays.toString(inputStrings));
	        
	        Map<String, List<String>> anagrams = new HashMap<>();
	        
	        for (String str : inputStrings) {
	            char[] charArray = str.toCharArray();
	            Arrays.sort(charArray);
	            String sortedStr = new String(charArray);
	            
	            if (!anagrams.containsKey(sortedStr)) {
	                anagrams.put(sortedStr, new ArrayList<>());
	            }
	            anagrams.get(sortedStr).add(str);
	            System.out.println(anagrams);
	        }
	       
	        List<List<String>> result = new ArrayList<>(anagrams.values());
	        System.out.println("Grouped Anagrams: " + result);
	    
	}
	
}
