//1816
import java.util.Scanner;

public class leet1816 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s=ob.nextLine();
        int k=ob.nextInt();
        String[] arr=s.split(" ");
        String n="";
        for(int i=0;i<k;i++)
        {
            if(i==k-1)
            n+=arr[i];
            else
            n+=arr[i]+" ";
        }
        System.out.println(n);
        ob.close();
    }
}
