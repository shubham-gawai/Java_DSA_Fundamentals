package hashMap;

import java.util.*;
import java.util.Arrays;
import java.util.Map.Entry;

public class frequencyCount1 {

	public static void main(String[] args) {
		int arr[] = { -1, 3, 4, 5, 7, -1, 9, 0, 7, 0};

		HashMap<Integer, Integer> hm = new HashMap<>();

		// counting the frequency of each element :
		for (var abc : arr) {
			hm.put(abc, hm.getOrDefault(abc, 0) + 1);
		}

		// prirnting the frequency count of each element :
		for (var entry : hm.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

	}

}
