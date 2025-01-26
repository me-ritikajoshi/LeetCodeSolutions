package JavaLeetCode;

import java.util.Arrays;

public class MissingNumber_268 {
    public static void main(String[] args) {
        int[] nums={9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int missingNum=nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=i){
                missingNum=i;
                break;
            }
        }
        return missingNum;
    }
}

