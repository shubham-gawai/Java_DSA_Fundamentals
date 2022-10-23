package BinarySearch;

public class lastOccurance {

	public static int lastOccuranceAlgo(int arr[], int target) {
		int start = 0, end = arr.length-1, res = -1;
		
		while(start <= end ) {
			int mid = start + (end - start)/2;
			
			if(arr[mid] == target) {
				res = mid ;
				start = mid + 1;	// re-confirm for last occurance 
			}
			else if(target > arr[mid]) {
				start = mid + 1;
				
			}else {
				end = mid -1;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		int arr [] = {1,1,2,2,2,3,4,5,6,6,7,7,7};
		int target = 2;
		// calling the last occurrence of the target value 7 :
		System.out.println(lastOccuranceAlgo(arr, target));

	}

}
