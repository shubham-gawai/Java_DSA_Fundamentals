package Strings;

public class subString {

	public static void main(String[] args) {
		String str = "Arun";

// First loop for starting index
		for (int i = 0; i < str.length(); i++) {
			StringBuilder subStr = new StringBuilder();
// Second loop is generating sub-String
			for (int j = i; j < str.length(); j++) {
				subStr.append(str.charAt(j));
				System.out.println(subStr + " ");
			}
		}

	}
}
