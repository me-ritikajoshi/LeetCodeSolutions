package JavaLeetCode;

import java.util.Arrays;

public class NumberSmallerThanCurrent_1365 {
    public static void main(String[] args) {
        int[] nums={8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] smallerNum=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count=0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]>nums[j] && nums[i]!=nums[j]){
                    count++;
                }
            }
            smallerNum[i]=count;
        }
        return smallerNum;
    }
}
