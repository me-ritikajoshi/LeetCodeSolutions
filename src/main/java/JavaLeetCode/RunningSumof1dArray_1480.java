package JavaLeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class RunningSumof1dArray_1480 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));

    }
    public static int[] runningSum(int[] nums) {
//      int sum=0;
//        ArrayList<Integer> sumNum=new ArrayList<Integer>();
//        for (int i = 0; i < nums.length; i++) {
//            sumNum.add(sum+=nums[i]);
//        }
        int sum=0;
        int[] result=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sum+= nums[i];
            result[i]=sum;
        }
        return result;
    }
}
