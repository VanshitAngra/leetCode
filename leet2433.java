import java.util.Arrays;
import java.util.Scanner;

public class leet2433 {
    public static int[] findArray(int[] pref) {
        int[] ans=new int[pref.length];
        ans[0]=pref[0];
        for(int i=1;i<pref.length;i++)
        {
            ans[i]=pref[i]^pref[i-1];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=ob.nextInt();
        }
        System.out.println(Arrays.toString(findArray(arr)));
        ob.close();
    }
}
