package JavaLeetCode;

public class PowerOfThree_326 {
    public static void main(String[] args) {
        int n=0;
        System.out.println(isPowerOfThree(n));

    }
    public static boolean isPowerOfThree(int n) {
        if(n==0) return false;
        while (n != 1) {
            if (n % 3 != 0)
                return false;
            n = n / 3;
        }
        return true;
    }
}
