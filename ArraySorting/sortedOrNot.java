package ArraySorting;

import java.util.Scanner;

public class sortedOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size :");
		int n = sc.nextInt();

		boolean checkOrder = true;
		int arr[] = new int[n];

		System.out.println("Enter elements :");
		for (int i = 0; i < n; i++) {

			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n - 1; i++) {

			if (arr[i] > arr[i + 1]) {
				checkOrder = false;
				break;
			}
		}
		if (checkOrder) {
			System.out.println("Yes, array is sorted");

		} else {
			System.out.println("No, array is not sorted");

		}
	}
}
