import java.util.Arrays;

/**
 * leet453
 */
public class leet453 {
    public static int minMoves(int[] nums) {
        Arrays.sort(nums);
        int a=0;
        for(int i=0;i<nums.length;i++)
        {
            int b=nums[i]-nums[0];
            a+=b;
        }
        return a;
    }
    public static void main(String[] args) {
        
    }
}