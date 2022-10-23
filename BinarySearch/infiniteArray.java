package BinarySearch;

public class infiniteArray {

	public static int infiniteArray(int arr[], int target) {
		int start = 0, end = 1;
		while (target > arr[end]) {
			start = end;
			end = end * 2;

			// edge case arrayOutOfBound Exception :
			if (end >= arr.length - 1) {
				end = arr.length - 1;
				break;
			}
		}

		// regular binary search algorithm :
		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target == arr[mid]) {
				return mid;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		// for elements missing :
		return -1;

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		int target = 6;
		 
		System.out.println(infiniteArray(arr, target));

	}
}
