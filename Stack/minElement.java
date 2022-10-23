package Stack;

import java.util.Collections;
import java.util.Stack;

public class minElement {

	public static void main(String[] args) {
		// int arr[] = {50,30,60,70,20};
		Stack<Integer> stk = new Stack<Integer>();

		stk.push(50);
		stk.push(30);
		stk.push(60);
		stk.push(70);
		stk.push(20);

		int min = 0;
		for (int x : stk) {
			min = stk.get(x);
			if (min > stk.get(x + 1)) {
				min = stk.get(x + 1);
			}

		}
		System.out.println(min);
		//Integer a = Collections.min(stk);
		//System.out.println(a);
	}

}
