package JavaLeetCode;

import java.util.*;

public class IntersectionOfTwoArrays_349 {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        for (int num1 : nums1) {
            set1.add(num1);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int num2 : nums2) {
            set2.add(num2);
        }
        Set<Integer> commonSet = new HashSet<>();
        for (int num : set1) {
            if (set2.contains(num)) {
                commonSet.add(num);
            }
        }

        int[] result = new int[commonSet.size()];
        int index = 0;
        for (int num : commonSet) {
            result[index++] = num;
        }
        return result;
    }
}