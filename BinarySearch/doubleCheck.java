package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class doubleCheck {
	public static void main(String args[]) {
		int arr[] = { 10, 2, 5, 8 };
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			
			int target = arr[i] * 2;
			Arrays.sort(arr);
			int idx = Arrays.binarySearch(arr, i + 1, arr.length, target);
			if (idx > -1) {
				System.out.println("TRUE");
				flag = true;
				break;
			} 
		}
		if(flag == false) {
			System.out.println("FALSE");
		}

	}

}
