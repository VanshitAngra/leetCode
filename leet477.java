import java.util.*;

public class leet477 {
    public static int totalHammingDistance(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++){
                sum+=Integer.bitCount(nums[i]^nums[j]);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=ob.nextInt();
        }
        System.out.println(totalHammingDistance(a));
        ob.close();
    }
}
