import java.util.Scanner;

public class leet371 {
    public static int getSum(int a, int b) {
        while(b!=0)
        {
            int carry=a&b;
            a^=b;
            b=carry<<1;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int a=ob.nextInt();
        int b=ob.nextInt();
        System.out.println(getSum(a, b));
        ob.close();
    }
}
