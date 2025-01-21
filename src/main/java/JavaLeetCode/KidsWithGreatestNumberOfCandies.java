package JavaLeetCode;
import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies={12,1,12};
        int extraCandies=10;
        System.out.println(kidsWithCandies(candies,extraCandies));

    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result=new ArrayList<>();
        int max=candies[0];
        for (int i = 0; i < candies.length; i++) {
            if(candies[i]>max){
                max=candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {
//            if(candies[i]+extraCandies >= max){
//                result.add(true);
//            }else result.add(false);
            result.add(candies[i]+extraCandies >= max);
        }
        return result;
    }
}
