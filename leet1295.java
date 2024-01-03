import java.util.Scanner;

public class leet1295 {
    public static int findNumbers(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            int a=0;
            while(nums[i]>0)
            {
                nums[i]/=10;
                a++;
            }
            if(a%2==0)
            c++;
        }
        return c;
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
        System.out.println(findNumbers(a));
    }
}
