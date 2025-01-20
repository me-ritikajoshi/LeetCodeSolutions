package JavaLeetCode;

public class MAximumCount_2529 {
    public static void main(String[] args) {
        int[] nums={-2,-1,-1,1,2,3};
        System.out.println(maximumCount(nums));

    }
    public static int maximumCount(int[] nums) {
        int positiveCount = 0, negativeCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                positiveCount++;
            } else if (nums[i] < 0) {
                negativeCount++;
            }
        }
        return Math.max(positiveCount, negativeCount);
    }
}
