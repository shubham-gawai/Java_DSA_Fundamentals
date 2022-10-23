package BinarySearch;

public class linearSearch {

	public static int linearSearchAlgo(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				System.out.println("Target Found");

				// index of my target
				return i;
			}

		}
		// target is missing in array :
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 6, 7, 8, 9, 34, 67, 98 };
		int target = 98;
		linearSearchAlgo(arr, target);

	}

}
