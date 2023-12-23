import java.util.Arrays;
import java.util.Scanner;

/**
 * leet169
 */
public class leet169 {
     public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] a=new int[n];
        System.out.println(majorityElement(a));
        ob.close();
    }
}