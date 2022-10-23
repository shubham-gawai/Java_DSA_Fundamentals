package hashMap;
import java.util.HashMap;
public class demo {

	public static void main(String args[]) {
		HashMap<Integer, String> hm = new HashMap<Integer, String> ();
		
		hm.put(1, "ragav");
		hm.put(2, "debnam");
		hm.put(3, "alycia");
		
		System.out.println(hm);
		
		System.out.println(hm.containsKey(9));
		System.out.println(hm.containsValue("alycia"));
	}
}
