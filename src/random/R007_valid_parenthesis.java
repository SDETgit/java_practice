package random;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

public class R007_valid_parenthesis {
	 

	public static void main(String[] args) {
String s = "()[]{}";
		

Stack<Character> stack = new Stack<Character>();
for (char c : s.toCharArray()) {
	if (c == '(')
		stack.push(')');
	else if (c == '{')
		stack.push('}');
	else if (c == '[')
		stack.push(']');
	else if (stack.isEmpty() || stack.pop() != c);

	System.out.println(stack);
}}
}
