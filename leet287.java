//287

import java.util.Arrays;
import java.util.Scanner;

public class leet287 {
    public static void main(String[] args) {
       Scanner ob=new Scanner(System.in);
       int n=ob.nextInt();
       int[] nums=new int[n];
       for(int i=0;i<n;i++)
       {
            nums[i]=ob.nextInt();
       } 
       ob.close();
       Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                System.out.println( nums[i]);
                return;

            }
        }
    }
}
