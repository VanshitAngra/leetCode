//191

import java.util.Scanner;

/**
 * bitCount
 */
public class bitCount {

    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        System.out.println(Integer.bitCount(n));
        ob.close();
    }
}