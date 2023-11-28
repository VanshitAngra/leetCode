import java.util.Scanner;

public class leet1534 {
    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int n=arr.length;
        int t=0;
        for(int i=0;i<n-2;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(Math.abs(arr[i] - arr[j])<=a&&Math.abs(arr[j] - arr[k]) <= b&&Math.abs(arr[i] - arr[k]) <= c)
                    t++;
                }
            }
        }
        return t;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=ob.nextInt();
        }
        int x=ob.nextInt();
        int y=ob.nextInt();
        int z=ob.nextInt();
        ob.close();
        countGoodTriplets(a, x, y, z);
    }
}
