//2605
import java.util.*;

public class minimumTwoDigit {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int m=ob.nextInt();
        int[] nums1=new int[n];
        int[] nums2=new int[m];
        for(int i=0;i<n;i++)
        {
            nums1[i]=ob.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            nums2[i]=ob.nextInt();
        }
        ob.close();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    System.out.println(nums1[i]);
                    return;
                }
            }
        }

        System.out.println(nums1[0]*10+nums2[0]>nums2[0]*10+nums1[0]?nums2[0]*10+nums1[0]:nums1[0]*10+nums2[0]);
    }
}
