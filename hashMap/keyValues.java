package hashMap;

import java.util.*;

public class keyValues {

	public static void main(String[] args) {

		HashMap<Integer, Integer> hm = new HashMap<>();

		for (int i = 1; i < 15; i++) {

			hm.put(i, i);
			System.out.println(hm.get(i) + "," + hm.get(i));
		}

	}
}
