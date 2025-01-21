package JavaLeetCode;

public class DivisibleAndNonDivisibleSumDifference_2894 {
    public static void main(String[] args) {
        int n = 5, m = 1;
        System.out.println(differenceOfSums(n,m));
    }

    public static int differenceOfSums(int n, int m) {
//        List<Integer> divisible=new ArrayList<>();
//        List<Integer> notDivisible=new ArrayList<>();

//
//        int sumOfDivisible=0;
//        int sumOfNotDivisible=0;
//
//        for (int i = 1; i <= n; i++) {
//            if(i%m==0){
//                divisible.add(i);
//                System.out.println(n);
////                System.out.println(sumOfDivisible);
//            }else{
//                notDivisible.add(i);
////                System.out.println(sumOfNotDivisible);
//            }
//        }
//        for (int i = 0; i < divisible.size(); i++) {
//            sumOfDivisible+=divisible.get(i);
//        }
//        for (int i = 0; i < notDivisible.size(); i++) {
//            sumOfNotDivisible+=notDivisible.get(i);
//        }
//        int difference=sumOfNotDivisible-sumOfDivisible;
//        return difference;



        int sumOfDivisible=0;
        int sumOfNotDivisible=0;

        for (int i = 1; i <= n; i++) {
            if(i%m==0) sumOfDivisible+=i;
            else sumOfNotDivisible+=i;
        }
        return sumOfNotDivisible-sumOfDivisible;
    }
}
