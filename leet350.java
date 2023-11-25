import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class leet350 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n1=ob.nextInt();
        int n2=ob.nextInt();
        int[] nums1=new int[n1];
        int[] nums2=new int[n2];
        for(int i=0;i<n1;i++)
        {
            nums1[i]=ob.nextInt();
        }
        for(int i=0;i<n2;i++)
        {
            nums2[i]=ob.nextInt();
        }
        ob.close();
         ArrayList<Integer> n=new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]==nums2[j])
            {
                n.add(nums1[i]);
                i++;j++;
            }
            else if(nums1[i]>nums2[j])
            j++;
            else
            i++;
        }
        int[] arr=new int[n.size()];
        for(int d=0;d<n.size();d++)
        {
            arr[d]=n.get(d);
        }
        System.out.println(Arrays.toString(arr));
    }
}
