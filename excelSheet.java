//171
//* 
import java.util.Scanner;

public class excelSheet {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s=ob.next();
        int a=0;
        for(int i=0;i<s.length();i++)
        {
            a=a*26+s.charAt(i)-64;
        }
        System.out.println(a);
        ob.close();
    }
}
