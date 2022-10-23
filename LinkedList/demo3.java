// package LinkedList;

import java.util.LinkedList;

public class demo3 {

	public static void main(String[] args) {

		LinkedList<Character> l1 = new LinkedList<>();

		l1.add('A');
		l1.add('B');
		l1.add('C');

		System.out.println(l1);

		LinkedList<Character> l2 = new LinkedList<>();

		l2.addAll(l1);
		l2.add('D');

		System.out.println(l2);
		l2.add('E');
		System.out.println(l2);

		l2.removeLast();
		System.out.println(l2);
		
		
		
	}
}
