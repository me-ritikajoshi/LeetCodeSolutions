package JavaLeetCode;

import java.util.List;

public class PermutationDifference_3146 {
    public static void main(String[] args) {
        String s="abcde";
        String t="edbac";
        System.out.println(findPermutationDifference(s,t));
    }
    public static int findPermutationDifference(String s, String t) {
        int sum=0;
        for (int i = 0; i < s.length(); i++){
            int absDiff  = 0;
            char currentChar = s.charAt(i);
            int charPositionAtT = t.indexOf(currentChar);
            absDiff = Math.abs(i - charPositionAtT);
            sum += absDiff;

//            sum+=Math.abs(i-s.indexOf(t.charAt(i)));
        }
        return sum;
    }
}
