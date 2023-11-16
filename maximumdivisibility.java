import java.util.Scanner;

public class maximumdivisibility {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] nums=new int[n];
        int d=ob.nextInt();
        int[] divisors=new int[d];
        for(int i=0;i<n;i++)
        {
            nums[i]=ob.nextInt();
        }
        for(int i=0;i<d;i++)
        {
            divisors[i]=ob.nextInt();
        }
        int a=-1;
        int aa=Integer.MAX_VALUE;
        for(int i=0;i<divisors.length;i++)
        {
            int c=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]%divisors[i]==0)
                c++;
            }
            if(c>a)
            {
            a=c;
            aa=divisors[i];
            }
            else if(c==a)
            {
                aa=Math.min(aa,divisors[i]);
            }
        }
        System.out.println(aa);
        ob.close();
    }
}
