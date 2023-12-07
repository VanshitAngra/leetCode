import java.util.Scanner;

public class leet485 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int a=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
              a=0;
            }
            else
            {
              a++;
              max=Math.max(a,max);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=ob.nextInt();
        }
        System.out.println(findMaxConsecutiveOnes(a));
        ob.close();
    }
}
