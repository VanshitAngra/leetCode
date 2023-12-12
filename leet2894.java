import java.util.Scanner;

public class leet2894 {
    public static int differenceOfSums(int n, int m) {
        int s=0;
        for(int i=1;i<=n;i++)
        {
            if(i%m==0)
            s-=i;
            else
            s+=i;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int m=ob.nextInt();
        ob.close();
        System.out.println(differenceOfSums(n, m));
    }
}
