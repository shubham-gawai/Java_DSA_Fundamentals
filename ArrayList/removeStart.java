package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class removeStart {

	public static void main(String[] args) {
		String str[] = {"simmi", "kabir", "karan", "mohit", "komal"};
		
		ArrayList<String> al = new ArrayList<String>();
		
		Collections.addAll(al, str);
		System.out.println(al);
		
		System.out.println("after sorting : ");
		Collections.sort(al);
		
		for(int i=0; i<al.size(); i++) {
			if(al.get(i).charAt(i)=='s') {
				al.remove(i);	// simmi should be remove :
			}
		}
		System.out.println(al);
		
		
		System.out.println("size is : "+ al.size());
		
		for(String x : al) {
			if(al.contains("karan")) {
				System.out.println(al.indexOf("karan"));
				break;
			}
		}
		
		for(String x : al) {
			if(al.contains("karan")) {
				System.out.println(al.add("bitto"));
				break;
			}
		}
		
		
		System.out.println(al);

	}

}
