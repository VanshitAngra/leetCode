//1528
import java.util.Scanner;

public class shuffleString {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s=ob.next();
        int n=ob.nextInt();
        int[] indices=new int[n];
        for(int i=0;i<n;i++)
        {
            indices[i]=ob.nextInt();
        }
        ob.close();
        String s1="";
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==indices[j])
                s1+=s.charAt(j);
            }
        }
        System.out.println(s1);
    }
}
