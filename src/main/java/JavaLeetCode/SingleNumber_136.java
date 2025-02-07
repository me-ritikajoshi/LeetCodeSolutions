package JavaLeetCode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber_136 {
    public static void main(String[] args) {
        int[] nums={4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        Map<Integer,Integer> countMaps=new HashMap<>();
        for (int num: nums){
            if(countMaps.containsKey(num)){
                countMaps.put(num,countMaps.get(num)+1);
            }else{
                countMaps.put(num,1);
            }

        }
        for (Map.Entry<Integer, Integer> entry : countMaps.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
