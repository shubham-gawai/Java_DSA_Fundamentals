package collection;
import java.util.ArrayList;
import java.util.List;
public class arrList {

	public static void main(String[] args) {
		
		int arr[]= {90,98,78,85,80,68};
		int totalMarks = 600;
		int sub =6;
		
		List<Integer> al = new ArrayList();
		al.add(90);
		al.add(98);
		al.add(78);
		al.add(85);
		al.add(80);
		al.add(94);
		//al.add(4, 78);
		
		System.out.println(al);
		
		int finalMarks =0;
		for(int i=0; i<al.size(); i++) {
			finalMarks = finalMarks + al.get(i);
			//System.out.println(al.get(i));
		}
		System.out.println(totalMarks);
		System.out.println(finalMarks);
		
		float percentage = (float)(finalMarks/totalMarks)*100;
		System.out.println(percentage);
		
		int count=0;
		for(int i=0; i<al.size(); i++) {
			if(al.get(i) > 90) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	// print the percentage of marks :
	// print the count of total sub having marks above 90 :
	// print the index of the list if the marks =90 use al.contains(90) method
	// 

	// complete the program 
	

}
