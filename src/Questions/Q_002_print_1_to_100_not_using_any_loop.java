package Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;


public class Q_002_print_1_to_100_not_using_any_loop {

static  void print(int x,int y) {
	
	System.out.println(x);
	if(x<y)
		print(x+1,y);
}
	public static void main(String[] args) {
			//Approach 1 using recursion 
		print(1,200);
			//Approach 2 
		  // Use IntStream.rangeClosed to generate a sequence of numbers from 1 to 100
        IntStream numbers = IntStream.rangeClosed(1, 100);

        // Use forEach to print each number in the sequence
        numbers.forEach(System.out::println);
	}
	
}
