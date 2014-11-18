package homework5;

import java.util.*;

public class ParenthesisChecker {

	public static boolean isBalance (String s) {
		if (s.length() == 0) {
			throw new IllegalArgumentException("There must be a string");
		}
		if (s.length() % 2 != 0) {
			return false;
		}
		Stack<Character> stack = new Stack<Character>();
		char c;
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if (c == '(' || c == '[') {
				stack.push(c);
			}
			else if (c == ')') {
				if (stack.empty()) {
					return false;
				}
				else if (stack.peek() == '(') {
					stack.pop();
				}
				else {
					return false;
				}
			}
			else {
				if (stack.empty()) {
					return false;
				}
				else if (stack.peek() == '[') {
					stack.pop();
				}
				else {
					return false;
				}
			}
		} 
		return stack.empty();
	}
	
}