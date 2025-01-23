package JavaLeetCode;

import java.util.Arrays;

public class ValidAnagram_242 {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {
        char[] sChar=s.toCharArray();
        char[] tChar=t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        return (Arrays.equals(sChar, tChar));
    }
}
