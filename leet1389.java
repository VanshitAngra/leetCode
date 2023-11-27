import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class leet1389 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n1=ob.nextInt();
        int n2=ob.nextInt();
        int[] nums=new int[n1];
        int[] index=new int[n2];
        for(int i=0;i<n1;i++)
        {
            nums[i]=ob.nextInt();
        }
        for(int i=0;i<n2;i++)
        {
            index[i]=ob.nextInt();
        }
        ob.close();
         List<Integer> a=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            a.add(index[i],nums[i]);
        }
        int[] arr=new int[a.size()];
        for(int i=0;i<a.size();i++)
        {
            arr[i]=a.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
