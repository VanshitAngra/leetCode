import java.util.*;

public class leet349 {
    public static void main(String[] args) {
         HashSet<Integer> set=new HashSet<>();
         Scanner ob=new Scanner(System.in);

        int a=ob.nextInt();
        int b=ob.nextInt();
        int[] nums1=new int[a];
        int[] nums2=new int[b];
        for(int i=0;i<a;i++)
        {
            nums1[i]=ob.nextInt();
        }
        for(int i=0;i<b;i++)
        {
            nums2[i]=ob.nextInt();
        }
        ob.close();
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    set.add(nums1[i]);
                    break;
                }
            }
        }
        int [] arr=new int[set.size()];
        int j=0;
        for(int i:set)
        {
            arr[j]=i;
            j++;
        }
       System.out.println(Arrays.toString(arr));
    }
}
