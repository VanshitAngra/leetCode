import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class leet1390 {
     public static int sumFourDivisors(int[] nums) {
        int sum=0;
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            int s=0;
            int a=0;
        for(int j = 1; j <= Math.sqrt(num); j++) {
                if(num % j == 0) {
                    if(j * j == num) {
                        a++;
                        s += j;
                    } else {
                        a += 2;
                        s += (j + (num / j));
                    }
                }
            }
            if(a == 4) {
                sum += s;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=ob.nextInt();
        }
        System.out.println(sumFourDivisors(a));
        ob.close();
    }
}
