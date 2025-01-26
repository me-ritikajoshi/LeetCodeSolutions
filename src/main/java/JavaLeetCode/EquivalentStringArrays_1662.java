package JavaLeetCode;

import java.util.Arrays;

public class EquivalentStringArrays_1662 {
    public static void main(String[] args) {
        String[] word1={"abc", "d", "defg"};
        String[] word2={"abcddefg"};
        System.out.println(arrayStringsAreEqual(word1,word2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
//        char[] charWord1= Arrays.toString(word1).toCharArray();
//        char[] charWord2= Arrays.toString(word2).toCharArray();
//        System.out.println(charWord1);
//        for(String ch1:word1){
//            char[] charWord1= Arrays.toString(ch1.toCharArray()).toCharArray();
//            System.out.println(charWord1);
//        }
//        for(String ch2:word1){
//            char[] charWord2= Arrays.toString(ch2.toCharArray()).toCharArray();
//            System.out.println(charWord2);
//        }

        String complete1 = "";
        String complete2 = "";
        for (int i = 0; i < word1.length; i++) complete1+=word1[i];
        for (int i = 0; i < word2.length; i++) complete2+=word2[i];
        return complete1.equalsIgnoreCase(complete2);
    }
}
