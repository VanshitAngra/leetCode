import java.util.Arrays;
import java.util.Scanner;

public class leet1491 {
    public static double average(int[] salary) {
        Arrays.sort(salary);
        double sum=0;
        for(int i=1;i<salary.length-1;i++)
        {
            sum+=salary[i];
        }
        return sum/(salary.length-2);
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=ob.nextInt();
        }
        System.out.println(average(a));
        ob.close();
    }
}
