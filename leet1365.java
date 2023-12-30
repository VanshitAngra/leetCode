import java.util.Arrays;
import java.util.Scanner;

public class leet1365 {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(nums[i]>nums[j])
                c++;
            }
            res[i]=c;
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
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(a)));
        ob.close();
    }
}
