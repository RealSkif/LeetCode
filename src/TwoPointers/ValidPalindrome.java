package TwoPointers;

import java.util.ArrayList;
import java.util.List;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        List<Character> charList = new ArrayList<>();
        int a = 0;
        while (a < s.length()) {
            char c = s.charAt(a);
            if (Character.isLetterOrDigit(c))
                charList.add(c);
            a++;
        }
        if (charList.size() == 0 || charList.size() == 1)
            return true;
        int j = 0;
        for (int i = charList.size() - 1; i >= charList.size() / 2; i--) {
            if (charList.get(i) != charList.get(j)) {
                return false;
            }
        }
        return true;
    }
}
