//2903

import java.util.*;

public class findValueDifference {
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
        int[] a=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                if(Math.abs(i-j) >= indexDifference&&Math.abs(nums[i]-nums[j])>=valueDifference)
                {
                    a[0]=i;
                    a[1]=j;
                    System.out.println(a[0]+""+a[1]);
                    return;
                }
            }
        }
        a[0]=-1;
        a[1]=-1;
        System.out.println(a[0]+""+a[1]);
    }
}
