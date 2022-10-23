package ArraySorting;

// insertion sort algorithm :
public class insertionSort {
	// TC : O(N) to O(N^2)
	// SC : O(1)
	static void insertionSorting(int arr[]) {

		int i, j, key;
		/*
		 * initializing i=1 and j as 1 index back i.e. i-1 initialize the key as arr[i]
		 * check for the while condition if j >= 0 && arr[j] > key then swap the j+1
		 * value to key :
		 */
		for (i = 1; i < arr.length; i++) {
			key = arr[i];
			j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;

			}
			arr[j + 1] = key;
		}
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 2, 0, -1, 4, 3, 7, 5, 0 };
		insertionSorting(arr);

	}

}
