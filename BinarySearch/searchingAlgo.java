package BinarySearch;

public class searchingAlgo {

	public static int binarySearch(int arr[], int target) {
		
		int start = 0, end = arr.length - 1;

		while (start <= end) {
			//int mid = (start + end)/2;     prone to overflow
			 
			int mid = start + (end-start)/2; // not prone to overflow
			 
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		// if the target is missing in the array then return -1 :
		return -1;
	}
	 
	public static void main(String[] args) {
		int[] arr = { 2, 3, 8, 16, 17, 20, 21, 22 };
		int target = 20; // output will give the index of the element :
		System.out.println(binarySearch(arr, target));

		// function to check the maximum capacity of an integer :
		// System.out.println(Integer.MAX_VALUE);
		// System.out.println(Integer.MAX_VALUE+1);
	}

}
