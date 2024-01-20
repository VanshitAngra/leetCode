//342
import java.util.Scanner;

public class leet342 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        System.out.println((n>0)&&((n&(n-1))==0)&&(n%3==1));
        ob.close();
    }
}
