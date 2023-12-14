import java.util.Scanner;

public class leet2710 {
    public static String removeTrailingZeros(String num) {
        int a=0;
        for(int i=num.length()-1;i>=0;i--)
        {
            if(num.charAt(i)=='0')
            a++;
            else
            break;
        }
        String res="";
        for(int i=0;i<num.length()-a;i++)
        {
            res+=num.charAt(i)+"";
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String n=ob.nextLine();
        System.out.println(removeTrailingZeros(n));
        ob.close();
    }

}
