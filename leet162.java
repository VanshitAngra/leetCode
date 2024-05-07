import java.util.Scanner;

public class leet162 {
    public int findPeakElement(int[] nums) {
        if(nums.length==1)
        return 0;
        if(nums[nums.length-2]<nums[nums.length-1])
        return nums.length-1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<nums[i-1])
            return i-1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=ob.nextInt();
        }
        ob.close();
        System.out.println(findPeakElement(a));
    }
    
}
