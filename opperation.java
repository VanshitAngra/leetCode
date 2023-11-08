//2460
import java.util.Arrays;
import java.util.Scanner;

public class opperation {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=ob.nextInt();
        }
        ob.close();
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                nums[i]*=2;
                nums[i+1]=0;
                i++;
            }
        }
        int a=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[a] = nums[i];
                a++;
            }
        }
         while(a<nums.length){
            nums[a] = 0;
            a++;
        }
        System.out.println(Arrays.toString(nums));

    }
}
