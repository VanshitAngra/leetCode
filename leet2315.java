import java.util.Scanner;

public class leet2315 {
    public static int countAsterisks(String s) {
        int c=0,t=0;
        char[] a=s.toCharArray();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]=='|')
            t++;

            if(a[i]=='*'&&t%2==0)
            c++;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s=ob.nextLine();
        System.out.println(countAsterisks(s));
        ob.close();
    }
}
