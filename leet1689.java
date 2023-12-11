import java.util.Scanner;

public class leet1689 {
    public static int minPartitions(String n) {
        int r=0;
        for(int i=0;i<n.length();i++)
        {
            r=Math.max(r,n.charAt(i)-'0');
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s=ob.next();
        System.out.println(minPartitions(s));
        ob.close();
    }
}
