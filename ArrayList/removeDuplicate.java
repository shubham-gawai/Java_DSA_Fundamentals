package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class removeDuplicate {

	public static void main(String[] args) {
		String str[] = {"simmi", "karan", "kabir", "simmi"};
		
		ArrayList<String> al = new ArrayList<String>();
		
		Collections.addAll(al, str);
		
		System.out.println(al);
		 
		ArrayList<String> al2 = new ArrayList<String>();
		
		for(String x : al) {
			if(!al2.contains(x)) {
				al2.add(x);
			}
		}
		System.out.println(al2);
	}

}