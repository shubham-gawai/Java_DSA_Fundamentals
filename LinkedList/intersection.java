// package LinkedList;

// intersection of two arrays using the LinkedList :
import java.util.LinkedList;

public class intersection {

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 5, 6 };
		int arr2[] = { 1, 2, 6, 7, 8, 9 };

		LinkedList<Integer> l1 = new LinkedList<>();
		LinkedList<Integer> l2 = new LinkedList<>();

		// loop for adding all arr1 elements in the l1 :
		for (var x : arr1) {
			l1.add(x);
		}

		// loop for adding all the arr2 elements in the l2
		for (var z : arr2) {
			l2.add(z);
		}

		// using contains method and checking if contains, then print :
		for (Integer k : l1) {

			if (l2.contains(k)) {
				System.out.print(k + " ");
			}

		}
	}

}
