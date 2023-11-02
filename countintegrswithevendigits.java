//2180
import java.util.Scanner;

public class countintegrswithevendigits {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int num=ob.nextInt();
        ob.close();
        int sum=0;
        for(int i=2;i<=num;i++)
        {
            int a=0,j=i;
            while(j>0)
            {
                int r=j%10;
                a+=r;
                j/=10;
            }
            if(a%2==0)
            sum++;
        }
        System.out.println(sum);
    }
}
