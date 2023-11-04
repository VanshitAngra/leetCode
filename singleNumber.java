import java.util.Scanner;

public class singleNumber {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=ob.nextInt();
        }
        int a=0;
        for(int i=0;i<n;i++)
        {
            a^=arr[i];
        }
        System.out.println(a);
        ob.close();
    }
}
