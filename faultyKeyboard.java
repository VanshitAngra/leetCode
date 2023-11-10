import java.util.Scanner;

public class faultyKeyboard {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s=ob.next();
        StringBuffer res=new StringBuffer();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='i')
            {
                res.reverse();
            }
            else
            res.append(s.charAt(i));
        }
        System.out.println(String.valueOf(res));
        ob.close();
    }
}
