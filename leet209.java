import java.util.Scanner;

public class leet209 {
    public static int minSubArrayLen(int target, int[] nums) {
        int s=0;
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            while(sum>=target)
            {
                min=Math.min(min,i-s+1);
                sum-=nums[s];
                s++;
            }
        }
        if(min==Integer.MAX_VALUE)
        return 0;
        else
        return min;
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
        System.out.println(minSubArrayLen(t, a));
    }
}
