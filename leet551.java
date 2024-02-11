//551
import java.util.*;

public class leet551 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s=ob.next();
        int a=0;
        int f=1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='A')
            {
                a++;

            }
            if(a<2)
            {
                if(i<s.length()-2)
                {
                    if(s.charAt(i)=='L'&&s.charAt(i+1)=='L'&&s.charAt(i+2)=='L')
                    {
                        f=0;
                        break;
                    }
                }
            }
            else
            {
                f=0;
                break;
            }

        }
        if(f==1)
        System.out.println("True");
        else
        System.out.println("False");
        ob.close();
    }
    
}
