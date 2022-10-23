package ArraySorting;

import java.util.*;
class Equilibrium {
	void equiliCheck(int arr[], int n) {
		int i, j;
		int sumL, sumR;

		for (i = 0; i < n; ++i) {

			sumL = 0;
			for (j = 0; j < i; j++)
				sumL += arr[j];

			sumR = 0;
			for (j = i + 1; j < n; j++)
				sumR += arr[j];

			// if (sumL == sumR)
		// 		return i;		
		 }

		// return -1;qaqAS

		// complete the program 
	}
	

}

public class equlibriumIdx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		
	}
}
