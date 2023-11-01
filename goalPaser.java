//1678
import java.util.Scanner;

public class goalPaser {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String command=ob.nextLine();
        String s="";
        for(int i=0;i<command.length();i++)
        {
            if(command.charAt(i)=='('&&command.charAt(i+1)==')')
            s+='o';
            else if(command.charAt(i)>='a'&&command.charAt(i)<='z'||command.charAt(i)>='A'&&command.charAt(i)<='Z')
            s+=command.charAt(i);
        }
        System.out.println(s);
        ob.close();
    }
}
