package dev.horyza.exercises;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class ValidParentheses {

	/*
	 * Given a string s containing just the characters '(', ')', '{', '}', '[' and
	 * ']', determine if the input string is valid.
	 * 
	 * An input string is valid if:
	 * 
	 * Open brackets must be closed by the same type of brackets. Open brackets must
	 * be closed in the correct order.
	 */

	public static void main(String[] args) {
		String input = "([)]";
		System.out.println(isValid(input));
	}
	
	private static boolean isValid(String s) {
        Map<Character, Character> brackets = new HashMap<Character, Character>();
        LinkedList<Character> list = new LinkedList<Character>();
        
        brackets.put(')','(');
        brackets.put(']','[');
        brackets.put('}','{');
        
        for (int i = 0; i < s.length(); i++) {
        	switch (s.charAt(i)) {
        	case '(':
        	case '[':
        	case '{':
        		list.add(s.charAt(i));
        		break;
        	case ')':
        	case ']':
        	case '}':
        		if (list.isEmpty()) return false;
        		if (brackets.get(s.charAt(i)) == list.getLast()) {
        			list.removeLast();
        		} else {
        			return false;
        		}
        		break;
        	}
        }
        if (list.isEmpty() && s != "")
        	return true;
        else
        	return false;
    }

}
