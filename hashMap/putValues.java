package hashMap;

import java.util.*;

public class putValues {

	public static void main(String[] args) {

		HashMap<String, String> hm = new HashMap<>();

		hm.put("1", "kabir");
		hm.put("A", "sagar");
		hm.put("12B", "1234");

		System.out.println(hm.get("1") + " , " + hm.get("A"));
		 
		hm.put("1", "simmi");
		System.out.println(hm.get("1"));

	}

}
