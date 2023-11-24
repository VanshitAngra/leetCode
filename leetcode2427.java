import java.util.Scanner;

public class leetcode2427 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int a=ob.nextInt();
        int b=ob.nextInt();
        ob.close();
        int n=a>b?b:a;
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(a%i==0&&b%i==0)
            c++;
        }
        System.out.println(c);
    }
}
