import java.util.Arrays;
import java.util.Scanner;

public class leet961 {
    public static int repeatedNTimes(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            return nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=ob.nextInt();
        }
        System.out.println(repeatedNTimes(arr));
        ob.close();
    }
}
