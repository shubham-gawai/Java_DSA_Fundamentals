package ArraySorting;

// TC : O(NlgN)
// SC : O(1)
import java.util.Arrays;

public class twoSum {

	public static void main(String[] args) {
		int arr[] = { 1, 10, 4, 6, 9, 3, 4, 5 };

		Arrays.sort(arr); // (NlgN)
		// [1,3,4,4,5,6,7,9,10]
		int low = 0, high = arr.length - 1;
		int target = 5;

		// two pointers approach :
		
	 
		while (low <= high) {
			if (arr[low] + arr[high] == target) {
				System.out.println(low + "," + high);
				low++;
				--high;
			} else if (arr[low] + arr[high] > target) {
				--high;
			} else {
				low++;
			}

		}
	}
}
