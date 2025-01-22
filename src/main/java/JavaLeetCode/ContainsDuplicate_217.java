package JavaLeetCode;

import java.util.HashSet;

public class ContainsDuplicate_217 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(containsDuplicate(nums));

    }
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> setNums=new HashSet<Integer>();
        for (int num : nums) setNums.add(num);
       return setNums.size()!= nums.length;
    }
}
