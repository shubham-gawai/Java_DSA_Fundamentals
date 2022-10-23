package Stack;
import java.util.Scanner;
import java.util.Stack;
public class reverseStringW {

	public static void main(String[] args) {
		String str = "Welcome to geekster classes. Hope you are doing good";
		 
		
		Stack<String> stk = new Stack<> ();
		
		for(var x : str.split(" ")) {
			stk.push(x);
		}
		 
		// if stack is not empty
		while(!stk.empty()) {
			 System.out.print(stk.peek()+" ");
			 stk.pop();
		 }

	}

}
