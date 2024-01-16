import java.util.Scanner;

public class leet9 {
    public static boolean isPalindrome(int x) {
        int a=x;
        int b=0;
        double sum=0;
        while(x>0)
        {
            b=x%10;
            sum=(sum*10)+b;
            x/=10;
        }
        return a==sum;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        System.out.println(isPalindrome(n));
        ob.close();
    }
}
