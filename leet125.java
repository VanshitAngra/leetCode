import java.util.*;

/**
 * validPalindrome
 */
public class leet125 {

    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s=ob.nextLine();
        ob.close();
            int l=s.length();
            String s1="";
            for(int i=0;i<l;i++)
            {
                if(s.charAt(i)>=97&&s.charAt(i)<=122)
                s1+=s.charAt(i);
            else if(s.charAt(i)>=65&&s.charAt(i)<=90)
            s1+=(char)(s.charAt(i)+32);
            }
            // System.out.println(s1);
        if(s1.length()==0)
        {
            System.out.println("true");
            return;
        }
        for(int i=0;i<=s1.length()/2;i++)
        {
            if(s1.charAt(i)!=s1.charAt(s1.length()-i-1))
            {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}