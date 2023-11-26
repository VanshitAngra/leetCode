import java.util.Scanner;
//268
public class leet268 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] arr=new int[n];
        int s=n*(n-1)/2;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=ob.nextInt();
            sum+=arr[i];
        }
        System.out.println(s-sum);
        ob.close();
    }
}
