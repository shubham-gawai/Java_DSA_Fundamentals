package Stack;

import java.util.Stack;

public class reverseString {

	public static void main(String[] args) {
		 String str = "Arun Singh";
		 
		 Stack<Character> stk = new Stack<> ();
		 
		 for(char ch: str.toCharArray()) {
			 stk.push(ch);
		 }
		 
		 while(!stk.empty()) {
			 System.out.print(stk.peek());
			 stk.pop();
		 }
	}

}
