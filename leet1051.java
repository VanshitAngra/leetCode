import java.util.Arrays;
import java.util.Scanner;

public class leet1051 {
    public static int heightChecker(int[] heights) {
        int[] c=new int[heights.length];
        for(int i=0;i<heights.length;i++)
        {
            c[i]=heights[i];
        }
        Arrays.sort(c);
        int a=0;
        for(int i=0;i<c.length;i++)
        {
            if(c[i]!=heights[i])
            a++;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=ob.nextInt();
        }
        System.out.println(heightChecker(a));
        ob.close();
    }
}
