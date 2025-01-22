package JavaLeetCode;

import java.util.Arrays;

public class ReverseWordsInString_151 {
    public static void main(String[] args) {
        String s="a good   example";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        StringBuilder revString = new StringBuilder();
        String[] sWords=s.replaceAll("( )+"," ").trim().split(" ");
        for (int i=sWords.length-1;i>=0;i--)
            revString.append(sWords[i]).append(" ");
        return revString.toString().trim();

    }
}
