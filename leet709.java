import java.util.Scanner;

public class leet709 {
    public static String toLowerCase(String s) {
        return s.toLowerCase();
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s=ob.nextLine();
        System.out.println(toLowerCase(s));
        ob.close();
    }
}
