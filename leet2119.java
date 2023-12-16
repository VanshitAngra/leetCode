import java.util.Scanner;

public class leet2119 {
    public static boolean isSameAfterReversals(int num) {
        int a=num;
        int rev=0;
        while(num>0)
        {
            rev=rev*10+(num%10);
            num/=10;
        }
        int r=0;
        while(rev>0)
        {
            r=r*10+rev%10;
            rev/=10;
        }
        return r==a;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        System.out.println(isSameAfterReversals(n));
        ob.close();
    }
}
