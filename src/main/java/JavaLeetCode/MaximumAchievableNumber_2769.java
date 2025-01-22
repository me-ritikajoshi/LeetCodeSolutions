package JavaLeetCode;

public class MaximumAchievableNumber_2769 {
    public static void main(String[] args) {
        int num=3, t=2;
        System.out.println(theMaximumAchievableX(num,t));

    }
    public static int theMaximumAchievableX(int num, int t) {
        int z=num+t;
        return z+t;
    }
}
