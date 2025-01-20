package JavaLeetCode;

public class TruncateSentence_1816 {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k =4;
        System.out.println(truncateSentence(s,k));
    }
    public static String truncateSentence(String s, int k) {
        String[] words=s.split(" ");
        String s1= "";
        if(k<=words.length){
            for (int i = 0; i < k; i++) {
                s1 = s1+words[i];
                s1 = s1 + " ";
            }
        }else{
            s1 = s;
        }
        return s1.trim();

    }
}
