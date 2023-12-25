import java.util.Scanner;

public class leet1592 {
    public staic boolean isThree(int n) {
        int a=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            a++;
        }
        return a==3;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int a=ob.nextInt();
        System.out.println(isThree(a));
        ob.close();
    }
}
