package hashMap;

import java.util.*;
// count the frequency of the every single string :
public class frequencyCount {

	public static void main(String[] args) {

		String arr[] = { "arun", "singh", "roshan", "arun", "yadav", "nav", "singh" };

		HashMap<String, Integer> hm = new HashMap<>();

		// counting the ferquency of each element :
		for (var word : arr) {
			hm.put(word, hm.getOrDefault(word, 0) + 1);

		}

		// Printing the frequency of each elements :
		for(var entry : hm.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}

}
