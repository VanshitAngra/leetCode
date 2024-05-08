import java.util.Scanner;

public class leet172 {
    public int trailingZeroes(int n) {
        int c=0;
        while(n>0)
        {
            n/=5;
            c+=n;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        System.out.println(trailingZeroes(n));
        ob.close();
    }
}
