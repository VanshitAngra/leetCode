import java.util.Arrays;
import java.util.Scanner;

public class leet2469 {
    public static double[] convertTemperature(double c) {
        double[] arr=new double[2];
        arr[0]=c+273.15;
        arr[1]=c*1.80+32.00;
        return arr;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        double a=ob.nextDouble();
        System.out.println(Arrays.toString(convertTemperature(a)));
        ob.close();
    }
}
