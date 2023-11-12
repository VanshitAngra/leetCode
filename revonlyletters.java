import java.util.Scanner;
//917
/**
 * revonlyletters
 */
public class revonlyletters {

    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String str=ob.nextLine();
        ob.close();
        char[] s=str.toCharArray();
        int l=0;
        int r=s.length-1;
        while(l<r)
        {
            if(!(s[l]>='a'&&s[l]<='z'||s[l]>='A'&&s[l]<='Z'))
            {
                l++;
            }
            else if(!(s[r]>='a'&&s[r]<='z'||s[r]>='A'&&s[r]<='Z'))
            r--;
            else
            {
                char t=s[l];
                s[l]=s[r];
                s[r]=t;
                l++;
                r--;
            }
        }
        System.out.println(String.valueOf(s));
    }
}