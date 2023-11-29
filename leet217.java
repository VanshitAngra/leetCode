//217
import java.util.Arrays;
import java.util.Scanner;

public class leet217 {
    public static boolean duplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++)
        {
                if(nums[i]==nums[i-1])
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=ob.nextInt();
        } 
        System.out.println(duplicate(arr));
        ob.close();
    }
}
