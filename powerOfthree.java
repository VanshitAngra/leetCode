import java.util.Scanner;

public class powerOfthree {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        ob.close();
        if(n==0)
        {
            System.out.println(false);
            return;

        }
        while(n%3==0)
        {
            n/=3;
        }
        System.out.println(n==1);
    }
}
