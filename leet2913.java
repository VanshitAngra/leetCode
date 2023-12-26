import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class leet2913 {
    public static int sumCounts(List<Integer> nums) {
        int sum=0;
        int n=nums.size();
          for(int i=0;i<n;i++)
          {
             HashSet<Integer> set=new HashSet<>();
            for(int j=i;j<n;j++){
                int a=nums.get(j);
                set.add(a);
                int size=set.size();
                sum+=size*size;
            }
         }
         return sum;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        List<Integer> l=new ArrayList<>();
        int n=ob.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=ob.nextInt();
        }
        for(int i:a)
        {
            l.add(i);
        }
        System.out.println(sumCounts(l));
        ob.close();
    }
}
