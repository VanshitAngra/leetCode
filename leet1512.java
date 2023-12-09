import java.util.Scanner;

public class leet1512 {
    public static int numIdenticalPairs(int[] nums) {
        int c=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]==nums[j])
                c++;
            }
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
        System.out.println(numIdenticalPairs(a));
        ob.close();
    }
}
