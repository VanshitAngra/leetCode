import java.util.*;

public class leet65 {
    public static boolean isNumber(String s) {
        boolean num=false;
        boolean exp=false;
        boolean dot=false;
        for(int i=0;i<s.length();i++)
        {
            char c=s.chatAt(i);
            if(c>='0'&&c<='9')
            num=true;
            else if (c=='e' || c=='E')
            {
                if(exp||!num)
                return false;

                exp=true;
                num=false;
            }   
            else if (c=='.')
            {
                if(dot || exp)
                return false;
                dot =true;
            }
             else if(c == '-' || c == '+')
            {
                if(i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E')
                return false;
            }
            else
            {
                return false;
            }

        }
        return num;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s=ob.nextLine();
        ob.close();
        System.out.println(isNumber(s));
    }
}
