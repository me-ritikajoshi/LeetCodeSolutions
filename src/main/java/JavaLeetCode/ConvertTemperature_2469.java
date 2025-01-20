package JavaLeetCode;

import java.util.Arrays;

public class ConvertTemperature_2469 {
    public static void main(String[] args) {
        double celsius=36.50;
        System.out.println(Arrays.toString(convertTemperature(celsius)));
    }
    public static double[] convertTemperature(double celsius) {
        double kelvin,fahrenheit;
        kelvin=celsius+273.15;
        fahrenheit=celsius * 1.80 + 32.00;

        double ans[]={kelvin,fahrenheit};
        return ans;
    }
}
