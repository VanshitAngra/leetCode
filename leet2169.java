import java.util.Scanner;

public class leet2169 {
    public static int countOperations(int num1, int num2) {
        int c=0;
        while(num1!=0 && num2!=0)
        {
            if(num1>=num2)
            {
                num1=num1-num2;
                c++;
            }
            else 
            {
            num2=num2-num1;
            c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int m=ob.nextInt();
        System.out.println(countOperations(n, m));
        ob.close();
    }
}
