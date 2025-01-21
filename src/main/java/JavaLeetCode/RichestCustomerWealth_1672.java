package JavaLeetCode;

import java.util.ArrayList;
import java.util.List;

public class RichestCustomerWealth_1672 {
    public static void main(String[] args) {
        int[][] accounts={{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(accounts));

    }
    public static int maximumWealth(int[][] accounts) {
        int temp = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum=0;
            for (int j = 0; j < accounts[i].length; j++)
                sum+=accounts[i][j];
            if(sum > temp) temp = sum;
        }
        return temp;
    }
}
