package BinarySearch;

public class binarySearch {
	public static int binarySearchAlgo(int arr[], int target) {

		// initializing the low and high first :
		int low = 0, high = arr.length - 1;

		while (low <= high) {
			// put the formula for the mid
			int mid = (low + high) / 2; // prone to overflow
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				low = mid + 1;
			} else
				high = mid - 1;
		}
		// if target not and it is missing found then return -1 :
		return -1;
	}


	public static void main(String[] args) {
		
		int arr[] = { 1, 2, 3, 14, 15, 20, 21, 22 };
		int target = 22;
		// calling the method for printing the target :
		System.out.println(binarySearchAlgo(arr, target));
	}

}
