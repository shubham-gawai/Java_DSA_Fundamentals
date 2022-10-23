package ArraySorting;

public class insrtionSort1 {

	public static void main(String[] args) {
		int arr[] = { 64, 22, 12, 21, 11 };
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			// int minIdx = i;

			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					int temp = 0;

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i] + " ");
		}
	}
}
