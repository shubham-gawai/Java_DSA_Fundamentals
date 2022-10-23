package ArraySorting;

import java.util.Arrays;

public class twoSumCount {

	public static void main(String[] args) {
		int arr[] = { 1, 10, 4, 6, 9, 3, 4, 5 };

		int n = arr.length;
		int target = 12;
		
		for(int i=0; i<n; i++) {
			int found =i;
			
			for(int j=i+1; j<n; j++) {
				 if(arr[i] + arr[j] == target) {
					 arr[i] = i; 
					 arr[j] =j;
					  
				 }
			}
		}
	}

}
