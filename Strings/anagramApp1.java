package Strings;

import java.util.Arrays;

// check if given strings are Anagram :
public class anagramApp1 {

	public static void main(String[] args) {
		String str = "Arun";
		String str1 = "unAr";

		boolean flag = true;

		char[] ch = str.toCharArray();
		char[] ch1 = str1.toCharArray();

		if (ch.length == ch.length) {
			Arrays.sort(ch);
			Arrays.sort(ch1);

			for (int i = 0; i < ch.length; i++) {
				if (ch[i] != ch1[i]) {
					System.out.println("Not Anagram");
					flag = false;
					break;
				}
			}
			if (flag == true) {
				System.out.println("Anagram");

			}

		}

	}

}
