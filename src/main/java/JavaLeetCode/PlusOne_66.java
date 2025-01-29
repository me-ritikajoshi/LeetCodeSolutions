package JavaLeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class PlusOne_66 {
    public static void main(String[] args) {
        int[] digits={9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    public static int[] plusOne(int[] digits) {
//        long num = 0;
//        for (int digit : digits) {
//            num = num * 10 + digit;
//        }
//        num+=1;
//        String numStr = Long.toString(num);
//        int[] result = new int[numStr.length()];
//        for (int i = 0; i < numStr.length(); i++) {
//            result[i] = numStr.charAt(i) - '0';
//        }
//        return result;

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}

