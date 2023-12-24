import java.util.Scanner;

public class leet1287 {
    public static int findSpecialInteger(int[] arr) {
        int c=(arr.length/4);
        for(int i=0;i<arr.length-c;i++)
        {
            if(arr[i]==arr[i+c])
            {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=ob.nextInt();
        }
        System.out.println(findSpecialInteger(a));
        ob.close();
    }
}
