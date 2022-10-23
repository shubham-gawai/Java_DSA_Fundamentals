package ArraySorting;

// expected OP : RRGGBB
public class RGB {

	public static void main(String[] args) {

		char arr[] = { 'R', 'G', 'R', 'B', 'G', 'B' };

		int low = 0, mid = 0, high = arr.length - 1;

		while (mid <= high) {
			
			if (arr[mid] == 'R') {
				
				char temp = arr[mid];
				arr[mid] = arr[low];																																																																																																														
				arr[low] =temp;
				low++;
				mid++;
				
				
			} else if (arr[mid] == 'B') {
				
				char tmp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = tmp;
				high--;
				
			} else {
				mid++;
			}

		}
		for (var x : arr) {
			System.out.print(x + ",");
		}

	}

}
