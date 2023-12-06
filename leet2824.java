import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class leet2824 {
    public static int countPairs(List<Integer> nums, int target) {
        int a=0;
        int n=nums.size();
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums.get(i)+nums.get(j)<target)
                a++;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        List<Integer> nums=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int t=ob.nextInt();
            nums.add(t);
        }
        int target=ob.nextInt();
        System.out.println(countPairs(nums, target));
        ob.close();
    }
}
