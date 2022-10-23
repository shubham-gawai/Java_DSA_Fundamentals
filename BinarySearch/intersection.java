package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class intersection {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		 
		int[] arr1 = new int[n];
		int[] arr2 = new int[m];

		
		for(int i=0; i<n; i++) {
			arr1[i]= sc.nextInt();
		}
		
		
		for(int i=0; i<m; i++) {
			arr2[i]= sc.nextInt();
		}
		
		//Arrays.sort(arr2);
		
		int count =0;

		for (int i = 0; i < n; i++) {
			int target = arr1[i];
			int idx = Arrays.binarySearch(arr2, target);
			
			if (idx > -1 ) {  //-1
				count++;
				//System.out.println(count);
				System.out.println(target);
				 
				
			}
			
		}

	}
}
