package ArraySorting;

import java.util.Arrays;

// check if two strings are anagram :
public class anagramStr {
    public static void main(String[] args) {
        
        String str1 = "geekster";
        String str2 = "gkseetre";

        if (str1.length() == str2.length()) {
            char[] char1 = str1.toCharArray();
            char[] char2 = str2.toCharArray();

            Arrays.sort(char1);
            Arrays.sort(char2); 

            boolean flag = true;

            for (int i = 0; i < char1.length; i++) {
                if (char1[i] != char2[i]) {
                    System.out.println("false");
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                System.out.println("true");
            }

        } else
            System.out.println("false");

    }
}