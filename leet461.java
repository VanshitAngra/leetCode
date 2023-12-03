import java.util.Scanner;

public class leet461 {
    public static int hammingDistance(int x, int y) {
        int c=0;
        int a=x^y;
        String s=Integer.toBinaryString(a);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            c++;
        }

        return c;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int x=ob.nextInt();
        int y=ob.nextInt();
        System.out.println(hammingDistance(x, y));
        ob.close();
    }
}
