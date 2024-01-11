import java.util.Scanner;

public class leet367 {
    public static boolean isPerfectSquare(int num) {
        if(num==1)
        return true;
        else
        {
            for(int i=2;i<=num/2&&i*i<=num;i++)
            {
                if(i*i==num)
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        ob.close();
        System.out.println(isPerfectSquare(n));
    }
}
