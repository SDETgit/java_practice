package Collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class C_002_remove_liked_list_elements {
	public static void main(String[] args) {
		LinkedList <String> list = new LinkedList<String>();
	     list.add("Geeks");
	        list.add("for");
	        list.add("Geeks");
	        list.add("10");
	        list.add("20");
	        System.out.println(list);
	        
	        list.remove("fare");
	        System.out.println(list);
	        
	        //int likedlist 
	        LinkedList <Integer> list2 = new LinkedList<Integer>();
	        list2.add(10);
	        list2.add(133);
	        list2.add(2332);
	        list2.add(33232);
	        list2.add(43232);
	        list2.add(23232);
	        list2.add(234);
	        System.out.println(list2);
	      //  list2.remove(234);
	        System.out.println(list2);
	        
	        Collection<Integer> collection = new HashSet<>();  
	        collection.add(5);  
	        collection.add(15);  
	        collection.add(52);  
	        collection.add(532);  
	        collection.add(52);  
	        for (Integer i:collection) {  
	            System.out.println(i);  
	        }  
	       //will remove the specified element from the collection  
	        //collection.remove();  
	        System.out.println("After removing 52 \nCollection : "+collection); 
	        
	        
	        //List .remove has 2 methods 
	        //1. rmeove via int 
	        //2. remove via object 
	        //if we pass int values it will by default will pass remove via int position 
	        // to remove via value we need to pass list.remove("3"); for string or list.remove(Integer.valurOf(3));
	        	
	        
	}
}