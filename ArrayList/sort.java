package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class sort {

	public static void main(String[] args) {
		String str[] = {"simmi", "kabir", "karan", "simmi", "akash"};
		
		ArrayList<String> al = new ArrayList<String>();
		
		Collections.addAll(al, str);
		
		Collections.sort(al);
		
		System.out.println(al);

	}

}
