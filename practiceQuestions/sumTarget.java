import java.io.*;
import java.util.*;

// number of count for elements sum which is equal to target : 
public class sumTarget {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int[n];

		int count = 0;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int target = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n - i; j++) {
				sum = arr[i] + arr[j];
				if (target == sum) {

					count++;
				}

			}
		}

		System.out.println(count);
	}
}