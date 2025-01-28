package JavaLeetCode;

import java.util.*;

public class DistinctStringinArray_2053 {
    public static void main(String[] args) {
        String[] arr={"d","b","c","b","c","a"};
        int k=2;
        System.out.println(kthDistinct(arr,k));
    }
    public static String kthDistinct(String[] arr, int k) {
        Map<String,Integer> countMap=new LinkedHashMap<>();
        for (String str:arr){
            if(countMap.containsKey(str)){
                int val=countMap.get(str);
                countMap.put(str,val+1);
            }else{
                countMap.put(str,1);
            }
        }
        List<String> list=new ArrayList<>();
        countMap.forEach((key,value)-> {
            if (value==1){
                list.add(key);
            }
        });
        String dis = "";
        if (k <= list.size()) dis = list.get(k - 1);
        return dis ;
    }
}
