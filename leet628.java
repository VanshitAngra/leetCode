import java.util.*;
//628
public class leet628 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=ob.nextInt();
        }
        ob.close();
        if(n==3)
        {
            System.out.println(nums[0]*nums[1]*nums[2]);
            return;
            //comment

        }
        Arrays.sort(nums);
      System.out.println(Math.max(nums[n-1] * nums[n-2] * nums[n-3], nums[0] * nums[1] * nums[n-1]));
    }
}
