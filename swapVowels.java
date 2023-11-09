//345
import java.util.Scanner;

public class swapVowels {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String str=ob.next();
        ob.close();
        char[] s=str.toCharArray();
        int n=str.length();
        int l=0;
        int r=n-1;
        while(l<r)
        {
            if(s[l]=='a'||s[l]=='e'||s[l]=='i'||s[l]=='o'||s[l]=='u'||s[l]=='A'||s[l]=='E'||s[l]=='I'||s[l]=='O'||s[l]=='U')
            {
                if(s[r]=='a'||s[r]=='e'||s[r]=='i'||s[r]=='o'||s[r]=='u'||s[r]=='A'||s[r]=='E'||s[r]=='I'||s[r]=='O'||s[r]=='U')
                {
                    char t=s[l];
                    s[l]=s[r];
                    s[r]=t;
                    l++;
                    r--;
                }
                else
                r--;
            }
            else
            l++;
        }
        System.out.println(String.valueOf(s));
    }
}
