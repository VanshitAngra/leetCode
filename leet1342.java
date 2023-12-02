import java.util.Scanner;

public class leet1342 {
    public static int numberOfSteps(int num) {
        int c=0;
        while(num>0)
        {
            if(num%2==0)
            num/=2;
            else 
            num-=1;
            c++;

        }
        return c;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        System.out.println(numberOfSteps(n));
        ob.close();
  }
}
