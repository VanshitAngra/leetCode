import java.util.Scanner;

public class leet2485 {
    public static int pivotInteger(int n) {
        int s=n*(n+1)/2;
        int a=0;
        for(int i=1;i<=n;i++)
        {
            a+=i;
            if(s-a+i==a)
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        System.out.println(pivotInteger(n));
        ob.close();
    }
}
