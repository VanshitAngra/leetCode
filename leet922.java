import java.util.Arrays;
import java.util.Scanner;

public class leet922 {
    public static int[] sortArrayByParityII(int[] nums) {
        int[] res=new int[nums.length];
        int a=0;
        int b=1;
        for(int i:nums)
        {
            if(i%2==0)
            {
                res[a]=i;
                a+=2;
            }
            else
            {
                res[b]=i;
                b+=2;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=ob.nextInt();
        }
        ob.close();
        System.out.println(Arrays.toString(sortArrayByParityII(a)));
    }
}
