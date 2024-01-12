import java.util.Scanner;

public class leet633 {
    public static boolean judgeSquareSum(int c) {
        int l=0;long r=(long)Math.sqrt(c);
        while(l<=r)
        {
            if((l*l)+(r*r)==c)
            return true;
            else if((l*l)+(r*r)<c)
            l++;
            else
            r--;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        System.out.println(judgeSquareSum(n));
        ob.close();
    }
}
