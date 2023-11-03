//258
import java.util.Scanner;

public class addDigits {
    static int sol(int num)
    {
        if(num==0)
        return 0;
        else if(num%9==0)
        return 9;
        else return num%9;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        ob.close();
        System.out.println(sol(n));

    }
}
