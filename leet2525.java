import java.util.Scanner;

public class leet2525 {
    public static String categorizeBox(int length, int width, int height, int mass) {
        double v=(double)(length)*(double)(width)*(double)(height);
         if(length>=10000||width>=10000||height>=10000||v>=1000000000)
         {
             if(mass>=100)
             return "Both";
             else
             return "Bulky";
         }
         else if(mass>=100)
         return "Heavy";
         else
         return "Neither";
     }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int l=ob.nextInt();
        int w=ob.nextInt();
        int h=ob.nextInt();
        int m=ob.nextInt();
        System.out.println(categorizeBox(l, w, h, m));
        ob.close();
    }
}
