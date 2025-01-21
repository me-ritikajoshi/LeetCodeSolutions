package JavaLeetCode;

import java.util.Arrays;

public class NumberOfConsistentStrings_1684 {
    public static void main(String[] args) {
        String allowed="fstqyienx";
        String[] words={"n","eeitfns","eqqqsfs","i","feniqis","lhoa","yqyitei","sqtn","kug","z","neqqis"};
        System.out.println(countConsistentStrings(allowed,words));
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int count=0 ;
        for (int i = 0; i < words.length; i++) {
            char[] wordsChar=words[i].toCharArray();
            for (int j = 0; j < wordsChar.length ; j++) {
                if(!allowed.contains(String.valueOf(wordsChar[j]))){
                    count++;
                    break;
                }
            }
        }
        return words.length-count;
    }
}
