package JavaLeetCode;

import java.util.ArrayList;

public class SubtractProductAndSum_1281 {
    public static void main(String[] args) {
        int n=234;
        System.out.println(subtractProductAndSum(n));

    }
    public static int subtractProductAndSum(int n) {
//       String num=Integer.toString(n);
//       int multiply=1;
//       int sum=0;
//        for (int i = 0; i < num.length(); i++) {
//            System.out.println(num.charAt(i));
//            multiply=multiply*num.charAt(i);
//            sum+=num.charAt(i);
//
//        }
//        System.out.println(multiply);
//        while (n > 0) {
//            System.out.println( n % 10);
//            n = n / 10;
//            multiply=multiply*n;
//        }
        int product=1;
        int sum=0;
        while(n>0) {
            int digit=n%10;
            product*=digit;
            sum+=digit;
            n=n/10;
        }
        return product-sum;
    }
}