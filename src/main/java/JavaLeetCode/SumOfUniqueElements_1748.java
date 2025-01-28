package JavaLeetCode;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class SumOfUniqueElements_1748 {
    public static void main(String[] args) {
        int[] nums={1,1,1,1,1};
        System.out.println(sumOfUnique(nums));

    }
    public static int sumOfUnique(int[] nums) {
        AtomicInteger sum= new AtomicInteger();
        Map<Integer, Integer> countArr=new LinkedHashMap<>();
        for (int num : nums) {
            if (countArr.containsKey(num)) {
                int val = countArr.get(num);
                countArr.put(num,val+1);
            } else {
                countArr.put(num, 1);
            }
        }
        countArr.forEach((key, value)->{
            if(value==1){
                sum.addAndGet(key);
            }
//            System.out.println(key.toString() + " -> " + value.toString());
        });


        return sum.get();
    }
}
