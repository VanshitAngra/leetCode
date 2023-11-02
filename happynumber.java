//202
import java.util.Scanner;

public class happynumber {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        ob.close();
        int t=0;
        while(t<10)
        {
            int s=0;
            while(n>0)
            {
                int r=n%10;
                s+=r*r;
                n/=10;

            }
            if(s==1)
            {
                System.out.println("true");
                return;
            }
            n=s;
            t++;
        }
        System.out.println("false");

    }
}
