import java.util.Arrays;
import java.util.Scanner;

public class leet1720 {
    public static int[] decode(int[] encoded, int first) {
        int[] arr=new int[encoded.length+1];
        arr[0]=first;
        int t=0;
        for(int i=0;i<encoded.length;i++)
        {
            int c=arr[t++]^encoded[i];
            arr[t]=c;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=ob.nextInt();
        }
        int t=ob.nextInt();
        System.out.println(Arrays.toString(decode(arr, t)));
        ob.close();
    }
}
