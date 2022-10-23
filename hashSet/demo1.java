package hashSet;
import java.util.*;
public class demo1 {

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<> ();
		
		hs.add(5);
		hs.add(3);
		hs.add(6);
		hs.add(5);
		//hs.add(2);
		//hs.add(16);
		
// input order also does not preserved :
// all the classes from set interface doesn't allow duplicates
		
// look at the output here, what we've added and what we are getting :
		
		System.out.println(hs.size());	// size op : 3
		System.out.println(hs);			// [3, 5, 6]
	}
}
