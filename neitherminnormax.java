//2733
import java.util.Arrays;
import java.util.Scanner;

public class neitherminnormax {
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
        int min=nums[0];
        int max=nums[n-1];
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=min&&nums[i]!=max)
            {
                System.out.println(nums[i]);
                return;
            }
        }
        System.out.println("-1");
    }
}
