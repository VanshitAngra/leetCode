import java.util.Arrays;
import java.util.Scanner;

/**
 * leet453
 */
public class leet453 {
    public static int minMoves(int[] nums) {
        Arrays.sort(nums);
        int a=0;
        for(int i=0;i<nums.length;i++)
        {
            int b=nums[i]-nums[0];
            a+=b;
        }
        return a;
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
        System.out.println(minMoves(a));
    }
}