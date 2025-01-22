package JavaLeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum_1 {
    public static void main(String[] args) {
        int[] nums={3,2,4};
        int target=6;
        System.out.println(Arrays.toString(twoSum(nums, target)));

    }
    public static int[] twoSum(int[] nums, int target) {
        int[] indArr=new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
                    indArr= new int[]{i, j};
                    break;
                }
            }
        }
        return indArr;
    }
}
