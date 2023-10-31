/**
 * validPalindrome
 */
public class validPalindrome {

    public static void main(String[] args) {
        String s="0P";
            int l=s.length();
            String s1="";
            for(int i=0;i<l;i++)
            {
                if(s.charAt(i)>=97&&s.charAt(i)<=122)
                s1+=s.charAt(i);
            else if(s.charAt(i)>=65&&s.charAt(i)<=90)
            s1+=(char)(s.charAt(i)+32);
            }
            System.out.println(s1);
        if(s1.length()==0)
        for(int i=0;i<=s1.length()/2;i++)
        {
            if(s1.charAt(i)!=s1.charAt(s1.length()-i-1))
            System.out.println("false");
        }
    }
}