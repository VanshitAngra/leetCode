import java.util.Arrays;
import java.util.Scanner;

public class leet1769 {
    public static int[] minOperations(String boxes) {
        int n=boxes.length();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(boxes.charAt(j)=='1')
                c+=Math.abs(i-j);
            }
            a[i]=c;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s=ob.nextLine();
        System.out.println(Arrays.toString(minOperations(s)));
        ob.close();
    }
}
