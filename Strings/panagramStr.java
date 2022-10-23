package Strings;

public class panagramStr {

	public static boolean panagramCheck(String str) {
		char fa[] = new char[26];

		for (char x : str.toCharArray()) {
			fa[x - 'a']++;
		}

		for (int i = 0; i < 26; i++) {
			if (fa[i] == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		String str = "pack my box with five doezen liquor jugs";
		panagramCheck(str);
	}

}
