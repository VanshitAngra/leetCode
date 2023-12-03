import java.util.Scanner;
//2535
public class leet2535 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=ob.nextInt();
        }
        ob.close();
        int sum=0,sum1=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            while(nums[i]>0)
            {
                sum1+=(nums[i]%10);
                nums[i]/=10;
            }
            
        }
        System.out.println(Math.abs(sum-sum1));
    }
}
