package JavaLeetCode;

public class MatchesInTournament_1688 {
    public static void main(String[] args) {
        int n=14;
        System.out.println(numberOfMatches(n));

    }
    public static int numberOfMatches(int n) {
        int match=0;
        while (n>1){
            if(n%2==0){
                match+=n/2;
                n=n/2;
            }else{
                match+=(n-1)/2;
                n=(n-1)/2+1;
            }
        }
        return match;
    }
}
