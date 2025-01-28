package JavaLeetCode;

import java.util.Arrays;

public class ShuffleArray_1470 {
    public static void main(String[] args) {
        int[] nums={2,5,1,3,4,7};
        int n=3;
        System.out.println(Arrays.toString(shuffle(nums, n)));

    }
    public static int[] shuffle(int[] nums, int n) {
        int[] initialArr=Arrays.copyOfRange(nums, 0, n);
        int[] finalArr=Arrays.copyOfRange(nums,n,nums.length);
        int[] result = new int[nums.length];

        for (int i = 0; i < n; i++) {
            result[i*2] = initialArr[i];
            result[i*2+1] = finalArr[i];
        }

        return result;
    }
}
