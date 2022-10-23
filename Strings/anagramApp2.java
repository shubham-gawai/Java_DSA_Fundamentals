package Strings;

public class anagramApp2 {

	public static void main(String[] args) {
		String s = "geekster";
		String t = "steekerg";
		// String t = "steekergDkjhg";

	    //
		if (s.length() == t.length()) {
			int fa[] = new int[26];

			for (int i = 0; i < s.length(); i++) {
				fa[s.charAt(i) - 'a']++;
			}

			for (int i = 0; i < t.length(); i++) {
				if (fa[t.charAt(i) - 'a'] <= 0) {
					System.out.println("not anagram");
				} else {
					fa[t.charAt(i) - 'a']--;
				}

			}

			for (int i = 0; i < 26; i++) {
				if (fa[i] != 0) {
					System.out.println("not Anagram");
				} else {
					System.out.println("Anagram");
					break;
				}
			}

		} else {
			System.out.println("not Anagram");
		}

	}

}