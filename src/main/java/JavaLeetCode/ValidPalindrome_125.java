package JavaLeetCode;

public class ValidPalindrome_125 {
    public static void main(String[] args) {
        String s = "ab_a";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
//        s = s.replaceAll("\\W", "");
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(s);
        StringBuilder res = new StringBuilder();
        res.append(s);
        res.reverse();
        return s.equals(String.valueOf(res));
    }
}
