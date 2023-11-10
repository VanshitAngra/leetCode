//2455
import java.util.Scanner;

public class averageevenno {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] nums=new int[n];
        int indexDifference=ob.nextInt();
        int valueDifference=ob.nextInt();
        for(int i=0;i<n;i++)
        {
            nums[i]=ob.nextInt();
        }
        ob.close();
        int sum=0;
        int a=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%6==0)
            {
                sum+=nums[i];
                a++;
            }
        }
        if(a>1)
        System.out.println(sum/a);
        else 
        System.out.println(sum/1);
    }
}
