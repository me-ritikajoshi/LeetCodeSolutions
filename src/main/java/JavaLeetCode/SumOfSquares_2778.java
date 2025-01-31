package JavaLeetCode;

public class SumOfSquares_2778 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(sumOfSquares(nums));
    }

    public static int sumOfSquares(int[] nums) {
        int sumOfSquare = 0;
        for (int i = 1; i <= nums.length; i++) {
            if (nums.length % i == 0) {
                sumOfSquare += nums[i-1] * nums[i-1];
            }
        }
        return sumOfSquare;

    }
}
