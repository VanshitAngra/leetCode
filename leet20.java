import java.util.Scanner;

public class leet20 {
    public static boolean isValid(String s) {
        int i=-1;
        char[] arr=new char[s.length()];
        for(char c:s.toCharArray())
        {
            if(c=='(' || c=='[' || c=='{')
            {
                arr[++i]=c;
            }
            else
            {
                if(i>=0&&(arr[i]=='(' &&c==')' || arr[i]=='{'&& c=='}' || arr[i]=='[' && c==']'))
                i--;
                else
                return false;
            }
        }
        return i==-1;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s=ob.nextLine();
        System.out.println(isValid(s));
        ob.close();
    }
}
