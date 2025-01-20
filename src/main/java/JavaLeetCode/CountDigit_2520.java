package JavaLeetCode;

public class CountDigit_2520 {
    public static void main(String[] args) {
        int num=7;
        System.out.println(countDigits(num));

    }
    public static int countDigits(int num) {
        String str_num=Integer.toString(num);
        String[] digits=str_num.split("");
        int count=0;

        for (String dig:digits){
            int intDig=(Integer.parseInt(dig));
            if(num%intDig==0){
                count++;
            }
        }

        return count;
    }
}
