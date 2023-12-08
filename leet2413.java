import java.util.Scanner;

public class leet2413 {
    public static int smallestEvenMultiple(int n) {
        return n%2==0?n:n*2;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        System.out.println(smallestEvenMultiple(n));
        ob.close();
    }
}
