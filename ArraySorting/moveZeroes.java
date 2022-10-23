package ArraySorting;

/*
 * Q. print the non zero elements first as in the same order they are and 
 *    zero elements right after them : 
 *    
 *    IP : [0,1,0,3,12]
 *    OP : [1,3,12,0,0]
 *    
 *    note : order should not be change for these non zero elements 
 */

public class moveZeroes {
	static void moveZeroesLast(int nums[]) {
		int low = 0, high = nums.length - 1;

		while (low <= high) {
			if (nums[low] == 0) {
				// swapping with nums[high] :
				int temp = nums[low];
				nums[low] = nums[high];
				nums[high] = temp;

				high--;

			} else {
				low++; // if low = non zero
			}
		}
 
		for (var z : nums) {
			System.out.print(z + ", ");
		}
	}

	public static void main(String[] args) {
		int nums[] = { 0, 1, 0, 3, 12 };
		moveZeroesLast(nums);
// in the output the order is getting changed for non zero elements :
	}

}
