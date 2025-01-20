package JavaLeetCode;

import java.io.FilterOutputStream;

public class ValueAfterOperations_2011 {
    public static void main(String[] args) {
        String[] operations={"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));
    }
    public static int finalValueAfterOperations(String[] operations) {
        int x=0;

        for(int i=0;i<operations.length;i++){
            if(operations[i].contains("++")){
                x=x+1;
            }else if(operations[i].contains("--")){
                x=x-1;
            }
        }
        return x;

    }
}
