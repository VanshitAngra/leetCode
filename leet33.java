import java.util.Scanner;

public class leet33 {
    public static int search(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(nums[mid]==target)
            return mid;
            else if (nums[l]<=nums[mid])
            {
                if(nums[l]<=target&&target<nums[mid])
                r=mid-1;
                else
                l=mid+1;
            }
            else
            {
                if(nums[mid]<target && target<=nums[r])
                l=mid+1;
                else
                r=mid-1;
            }
        }
        return -1;
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
        System.out.println(search(a,t));
        ob.close();
    }
}
