import java.util.Scanner;

public class leet504 {
    public static String convertToBase7(int num) {
        if(num==0)
        return "0";
        String ans="";
        String sum="";
        int c=num;
        int b=Math.abs(num);
        while(b>0)
        {
            sum+=b%7;
            b/=7;
        }
        StringBuilder a=new StringBuilder();
        a.append(sum);
        ans=String.valueOf(a.reverse());
        if(num>=0)
        return ans;
        else
        return "-"+ans;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        System.out.println(convertToBase7(n));
        ob.close();
    }
}
