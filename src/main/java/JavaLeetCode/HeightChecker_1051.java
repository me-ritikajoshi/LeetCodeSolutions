package JavaLeetCode;

import java.util.Arrays;

public class HeightChecker_1051 {
    public static void main(String[] args) {
        int[] heights = {1, 1, 4, 2, 1, 3};
        System.out.println(heightChecker(heights));
    }

    public static int heightChecker(int[] heights) {
        int count=0;
        int[] sortedHeights= Arrays.copyOf(heights, heights.length);
        Arrays.sort(sortedHeights);
        for (int i = 0; i < heights.length; i++) {
            if (sortedHeights[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }
}
