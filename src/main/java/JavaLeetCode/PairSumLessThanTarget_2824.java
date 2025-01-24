package JavaLeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairSumLessThanTarget_2824 {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>(Arrays.asList(-1,1,2,3,1));
        int target=2;
        System.out.println(countPairs(nums,target));

    }
    public static int countPairs(List<Integer> nums, int target) {
        int count=0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i+1; j < nums.size(); j++) {
                if(nums.get(i)+nums.get(j)<target) {
                    count++;
                }
            }
        }
        return count;
    }
}
