import java.util.Arrays;
import java.util.Scanner;
//2160
public class sumof4 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int num=ob.nextInt();
        ob.close();
        int[] a=new int[4];
        for(int i=0;i<4;i++)
        {
            a[i]=num%10;
            num/=10;
        }
        Arrays.sort(a);
        System.out.println((a[0]*10+a[2])+(a[1]*10+a[3]));
    }
}
