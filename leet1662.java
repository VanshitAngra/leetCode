import java.util.Scanner;

public class leet1662 {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a="",b="";
        for(String i:word1)
        {
            a+=i;
        }
        for(String i:word2)
        {
            b+=i;
        }
        return (a.equals(b));

    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int m=ob.nextInt();
        String[] a=new String[n];
        String[] b=new String[m];
        for(int i=0;i<n;i++)
        {
            a[i]=ob.next();
        }
        for (int i = 0; i < m; i++) {
            b[i]=ob.next();
        }
        System.out.println(arrayStringsAreEqual(a, b));
        ob.close();
    }
}
