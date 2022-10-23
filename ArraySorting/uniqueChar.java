package ArraySorting;
import java.util.Arrays;
public class uniqueChar {

	public static void main(String[] args) {
		 String str = "abcdabxyz";		
		 //String str = "ancbdhyft";

/*
 * Approach 1:
 * char ch[] = str.toCharArray();  // convert string to char[]
 * Arrays.sort(ch);				   // sort ch[]
 * 
 * Approach 2:
 * using frequency array to solve this problem :
 * frequency Array works on the ASCII values of char :
 */ 
		 int fa[] = new int[26];
		 
		 for(int i=0; i < str.length(); i++){
			 fa[str.charAt(i) -'a']++;
		 }
		 
		 for(int i=0; i< 26; i++) {
			 if(fa[i] > 1) {
				 System.out.println("contains duplicate char");
				 break;
			 }
			 else {
				 System.out.println("not contain duplicate char");
				 break;
			 }
		 }
	}
 
}
