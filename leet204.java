import java.util.Scanner;

public class leet204 {
    public static int countPrimes(int n) {
        boolean[] notPrime=new boolean[n];
        int c=0;
        for(int i=2;i<n;i++)
        {
            if(notPrime[i]==false)
            c++;
            for(int j=2;i*j<n;j++)
            {
                notPrime[i*j]=true;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner ob =new Scanner(System.in);
        int n=ob.nextInt();
        System.out.println(countPrimes(n));
        ob.close();
    }
}
