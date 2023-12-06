import java.util.Arrays;
import java.util.Scanner;

public class leet1979 {
    public static int findGCD(int[] nums) {
        Arrays.sort(nums);
        int a=nums[0];
        int b=nums[nums.length-1];
        int t=1;
        for(int i=1;i<=a&&i<=b;i++)
        {
            if(a%i==0&&b%i==0)
            t=i;
        }
        return t;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=ob.nextInt();
        }
        System.out.println(findGCD(arr));
        ob.close();
    }
}
