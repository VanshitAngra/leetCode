import java.util.Arrays;
import java.util.Scanner;

public class leet1089 {
    public static void duplicateZeros(int[] arr) {
        int n=arr.length;
        int[] temp=arr.clone();

        int ind=0;
        for(int i=0;ind<n;i++)
        {
            arr[ind++]=temp[i];
            if(temp[i]==0 && ind!=n)
            arr[ind++]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=ob.nextInt();
        }
        duplicateZeros(a);
    }
}
