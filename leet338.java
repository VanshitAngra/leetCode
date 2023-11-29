import java.util.Scanner;
//338
public class leet338 {
        public static void main(String[] args) {
            Scanner ob=new Scanner(System.in);
            int n=ob.nextInt();
            int[] arr=new int[n+1];
            for(int i=0;i<=n;i++)
            {
                arr[i]=Integer.bitCount(i);
            }
            for(int i=0;i<=n;i++)
            {
                System.out.print(arr[i]+" ");
            }
            ob.close();
        }
    }

