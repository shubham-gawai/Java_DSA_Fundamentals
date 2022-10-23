package Stack;

import java.util.Stack;

public class parentheses3 {

	public static void main(String[] args) {

		String str = "(()()(";
		
		Stack<Character> s = new Stack<Character> ();
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '(') {
				s.push(')');
			}else {
				s.pop();
			}

		}
	// remove errors	
	//  for(char x :  s.push(null)) {
			  
	//  }
		
	}

}
