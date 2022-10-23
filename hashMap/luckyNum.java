package hashMap;

import java.util.HashMap;

public class luckyNum {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 2, 3, 3, 4 };

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		// counting the ferquency of each element :
		for (var nums : arr) {
			hm.put(nums, hm.getOrDefault(nums, 0) + 1);

		}

		int res = -1;
		// comparing the key and value
		for (var entry : hm.entrySet()) {
			// System.out.println(entry.getKey() + ":" + entry.getValue());

			if (entry.getKey() == entry.getValue()) {
				for (var x : arr) {
					if (entry.getValue() < x) {
						res = Math.max(entry.getKey(), x);

					}
				}
				System.out.println(res);
// print the max one only 
// and complete the program 
			}

		}

	}

}
