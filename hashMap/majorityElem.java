package hashMap;
import java.util.*;
/*
 * majority elements means the total count of that element is greater than the 
 * lenght of array divide by 2 :
 * i.e. : majorityElements > N/2 :  
 * 
 */
public class majorityElem {

	public static void main(String[] args) {

		int arr[] = {2,2,1,1,1,2,2,1,2};
		int majorityElement = -1;
		
		HashMap<Integer, Integer> hm = new HashMap<> ();
		
		// loop for finding the frequency of each elements :
		for(var num : arr) {
			hm.put(num, hm.getOrDefault(num,0)+1);
		}

		// comparing the Majority element and the arr.lenght/2 : is greater or not
		
		int n = arr.length;
		for(var entry : hm.entrySet()) {
			if(entry.getValue() > n/2);
			majorityElement = entry.getKey();
			break;
		}
		System.out.println(majorityElement);
	//  this is giving us the output element as 1 : but it should have given 2
	// lenght  = 9 : so 
	// count for Element 2:5  & for 1:4
	// so the majority element here is 2 :
	// complete the program 
	 
	}

}
