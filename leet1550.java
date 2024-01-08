import java.util.Scanner;

public class leet1550 {
    public static boolean threeConsecutiveOdds(int[] arr) {
        for(int i=0;i<arr.length-2;i++)
        {
            if(arr[i]%2==1&&arr[i+1]%2==1&&arr[i+2]%2==1)
            return true;
        }
        return false;
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
        System.out.println(threeConsecutiveOdds(nums));
    }
}
