//**************** */

import java.util.Arrays;
import java.util.Scanner;

public class leet34 {
    public static int[] searchRange(int[] nums, int target) {
        int[] a={-1,-1};
        int l=0,r=nums.length-1;
        int m=l+(r-l)/2;
        while(l<=r)
        {
            m=l+(r-l)/2;
            if(nums[m]==target)
            {
                a[0]=m;
                r=m-1;
            }
            else if(nums[m]<target)
            l=m+1;
            else
            r=m-1;
        }
        l=0;r=nums.length-1;
        while(l<=r)
        {
            m=l+(r-l)/2;
            if(nums[m]==target)
            {
                a[1]=m;
                l=m+1;
            }
            else if(nums[m]<target)
            l=m+1;
            else
            r=m-1;
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
        int t=ob.nextInt();
        ob.close();
        System.out.println(Arrays.toString(searchRange(a, t)));
    }
}
