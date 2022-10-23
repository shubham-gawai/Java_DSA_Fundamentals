package hashMap;

import java.util.*;
import java.util.HashMap;
import java.util.List;

public class anagram {

	public static void main(String[] args) {
		String arr[] = { "cat", "tac", "eat", "tea" };

		HashMap<String, Integer> hm = new HashMap<>();

		// loop for finding the frequency of each elements :
		for (var num : arr) {
			hm.put(num, hm.getOrDefault(num, 0) + 1);
		}
 
	}

}
