package ArraySorting;

import java.util.*;

public class lambdaExp {

	public static void main(String[] args) {
		Integer arr[] = { 2, 6, 9, 8, 55, -2, 45, 7, -3 };

	// using the lambda expression to write the logic :
		Arrays.sort(arr, (x, y) -> {
			return -1 * (x - y);
		});

	// printing sorted array in the decreasing order using for each loop:
		for (int k : arr) {
			System.out.print(k + " ");
		}
		
	// this SOP is for new line :
		System.out.println();

		String str[] = { "Arun", "Arun", "Singh", "A", "b", "Kart" };

	// using the lambda expression to write the logic :
		Arrays.sort(str, (x, y) -> {
			return -1 * (x.length() - y.length());
		});

	// (Sorting in decer') printing all the string Elements in the decreasing length
		 
		for (String x : str) {
			System.out.print(x + " ");
		}
	}

}
