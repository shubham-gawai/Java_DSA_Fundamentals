package DSA;
import java.util.*;
import java.util.HashMap;

public class majorityElement {
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
		for(var x : hm.entrySet()) {
			if(x.getValue() > n/2);
			majorityElement = x.getKey();
			break;
		}hjh
		// System.out.println(majorityElement);
    }
}

  /*
        * majority elements means the total count of that element is greater than the 
        * lenght of array divide by 2 :
        * i.e. : majorityElements > N/2 :  
 */

//  this is giving us the output element as 1 : but it should have given 2
  
// frequency of Element 2 is 5  & 1 is 4
// so the majority element here is 2 : b'coz its frequency is > than the arr.length/2 
// complete the program 