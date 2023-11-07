//revise *
//414 
import java.util.*;

public class thirdMax {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=ob.nextInt();
        }
        ob.close();
        Arrays.sort(nums);
        HashSet<Integer> h=new HashSet<>();
        for(int i=nums.length-1;i>=0;i--)
        {
            h.add(nums[i]);
            if(h.size()==3)
            {
                System.out.println(nums[i]);
                return;
            }
        }
        System.out.println(nums[nums.length-1]);
    }
}
