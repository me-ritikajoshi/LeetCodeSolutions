package JavaLeetCode;

import java.util.Arrays;

public class FinalArrayAfterMultiplier_3264 {
    public static void main(String[] args) {
        int[] nums = {2, 1, 3, 5, 6};
        int k = 5;
        int multiplier = 2;
        System.out.println(Arrays.toString(getFinalState(nums, k, multiplier)));
    }

    public static int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int i = 0; i < k; i++) {
            int minValue = nums[0];
            for (int j = 0; j < nums.length; j++) {
                if(nums[j] < minValue) {
                    minValue = nums[j];
                }
            }
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == minValue){
                    nums[j] = nums[j] * multiplier;
                    break;
                }
            }
        }
        return nums;
    }
}


