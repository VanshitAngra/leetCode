import java.util.Scanner;

public class leet1822 {
    public static int arraySign(int[] nums) {
        int count=0;
         int n = nums.length;
         for(int i=0;i<n;i++)
         {
 
             if(nums[i]==0)
             {
                 return 0;
             }
             else if(nums[i]<0)
             {
                 count++;
             }
         }
 
         if(count%2!=0)
         {
             return -1;
         }
 
         else
         {
             return 1;
         }
     }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=ob.nextInt();
        }
        ob.close();
        System.out.println(arraySign(nums));
    }
}
