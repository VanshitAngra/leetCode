//263
import java.util.Scanner;

public class leet263 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        while(n>1)
        {
            if(n%2==0)
            n/=2;
            else if(n%3==0)
            n/=3;
            else if(n%5==0)
            n/=5;
            else if(n>1)
            {
                System.out.println("false");
                break;
            }
        }
        if(n>0||n==1)
        System.out.println("true");
        else
        System.out.println("false");

        ob.close();
    }
}
