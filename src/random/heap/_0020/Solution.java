package random.heap._0020;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 20. 有效的括号
 * @author maoze.yao
 *
 */
public class Solution {
	
	public boolean isValid(String s) {
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }

        Map<Character, Character> pairs = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        Deque<Character> stack = new LinkedList<Character>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (pairs.containsKey(ch)) {
                if (stack.isEmpty() || stack.peek() != pairs.get(ch)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }

//	public boolean isValid(String s) {
//		int len = s.trim().length();
//
//		if (len == 0) {
//			return true;
//		}
//		
//		if (len % 2 == 1) {
//			return false;
//		}
//		
//		char[] arr = s.toCharArray();
//		
//		int middle = len / 2;
//		for (int i = middle; i < len; i++) {
//			
//			char c = arr[i-1];
//			switch (c) {
//			case '[':
//				if (arr[i] != ']') 
//					return false;
//				break;
//			case '{':
//				if (arr[i] != '}') 
//					return false;		
//				break;
//			case '(':
//				if (arr[i] != ')') 
//					return false;
//				break;
//
//			default:
//				return false;
//			}
//			
//		}
//		
//		return true;
//		
//    }
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.isValid("()[]{}"));
	}
}
