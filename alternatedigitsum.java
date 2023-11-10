//2544
import java.util.Scanner;

public class alternatedigitsum {
    public static int alternateDigitSum(int n) {
        int sum=0,c=1;
        String s=n+"";
        if(s.length()%2==0)
        {
            c=-1;
        }
        while(n>0)
        {
            int r=n%10;
            sum+=(r*c);
            n/=10;
            c*=-1;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        ob.close();
        System.out.println(alternateDigitSum(n));
    }
}
