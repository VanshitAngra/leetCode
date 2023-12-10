import java.util.Arrays;
import java.util.Scanner;

/**
 * leet81
 */
public class leet81 {
    public static boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        int l=0,r=nums.length-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(nums[mid]==target)
            return true;
            else if(nums[mid]>target)
            r=mid-1;
            else
            l=mid+1;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=ob.nextInt();
        }
        int t=ob.nextInt();
        System.out.println(search(nums, t));
        ob.close();
    }
}