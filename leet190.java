import java.util.Scanner;

public class leet190 {
    public static int reverseBits(int n) {
        if(n==0)
        return 0;

        int ans=0;
        for(int i=0;i<32;i++)
        {
            ans <<=1;
            ans=ans | (n&1);
            n>>=1;
        }
        return ans;

        
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        System.out.println(reverseBits(n));
        ob.close();
    }
}
