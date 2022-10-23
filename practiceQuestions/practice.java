import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class practice {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n - 1];

		int op[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}

		Arrays.sort(arr);

		boolean flag = true;
		for (int i = 0; i < n; i++) {
			if (arr[i] < arr[i + 1]) {
				flag = false;
				// System.out.print(arr[i + 1] + 1 + " ");
//			} else if (arr[i] < 0 && arr[i + 1] < 0) {
//				System.out.print(1);
			}

			for (int j = 0; j < n; j++) {
				if (flag) {
					System.out.println(op[i + 1] + 1 + " ");
				} else if (op[i] < 0 && op[i + 1] < 0) {
					System.out.println(1);
				}
			}

		}

	}
}
