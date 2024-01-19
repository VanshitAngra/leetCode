import java.util.Scanner;

public class leet704 {
    public static int search(int[] nums, int target) {
        int l=0;int r=nums.length;
        int mid=l+(r-l)/2;
        while(l<r)
        {
            mid=l+(r-l)/2;
            if(nums[mid]==target)
            return mid;
            else if(nums[mid]>target)
            r--;
            else
            l++;
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
        System.out.println(search(a, t));
        ob.close();
    }
}
