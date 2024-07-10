package Collection;

import java.util.LinkedList;

public class C_001_Collection_add_remove_elements {
	public static void main(String[] args) {
	
	 LinkedList<String> list = new LinkedList<String>();
	 
     // Adding elements in the list
     // Using add() method
     list.add("Geeks");
     list.add("for");
     list.add("Geeks");
     list.add("10");
     list.add("20");

     // Printing the elements inside LinkedList
     System.out.println("LinkedList:" + list);

     // Removing the head from List
     // using remove() method
     list.remove("20"); //Calls remove(Object o ) method 
     list.remove(2);    //calls remove(int index) method 

     // Printing the final elements inside Linkedlist
     System.out.println("Final LinkedList:" + list);
     
     LinkedList<Integer> list1 = new LinkedList<Integer>();
     list1.add(1);
     list1.add(2);
     list1.add(3);
     list1.add(4);
     list1.add(5);
     list1.add(6);
     list1.add(7);
     System.out.println(list1);
     list1.remove(3);				//calls remove(int index) method 
     list1.remove(Integer.valueOf(2)); //Calls remove(Object o method )
     System.out.println(list1);
     
}
} 