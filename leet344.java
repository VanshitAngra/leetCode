//344

import java.util.Scanner;

public class leet344 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        char[] s=new char[n];
        for(int i=0;i<n;i++)
        {
            s[i]=ob.next().charAt(0);
        }
        ob.close();
        for(int i=0;i<s.length/2;i++)
        {
            char t=s[i];
            s[i]=s[s.length-1-i];
            s[s.length-1-i]=t;
        }
        System.out.println(String.valueOf(s));
    }
}
