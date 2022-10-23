package ArraySorting;

import java.util.Arrays;

public class bubbleSort {

	// TC : O(N) to O(N^2) OR Theta(N^2)
	// SC : O(1)
	static void bubbleSorting(int[] arr) {
		int i, j, temp;
		
		boolean swapped = false;				// 1st optimization
		// logic for bubble sorting
		for (i = 0; i < arr.length - 1; i++) {
			for (j = 0; j < arr.length - 1 -j; j++) {	// 2nd optimization is (arr.length -1 -j) 
				if (arr[i] > arr[i + 1]) {				// it will never let the loop go at the already sorted elements 
					temp = arr[i]; 				// swapping two cons numbers
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;

					swapped = true;
				}

			}
			if (swapped == false) {
				break;
			}
// check the output once it is mismtched :
		}  

		// now , printing the sorted array :
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void main(String[] args) {
		int arr[] = { -1, 0, 2, 1, 3, 5, 3, 9, 7 };
		bubbleSorting(arr);
 
		// for the sake of setting the boolean condition :

	}

}
