import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class leet412 {
    public static List<String> fizzBuzz(int n) {
        List<String> l=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(i%3==0&&i%5==0)
            l.add("FizzBuzz");
            else if(i%3==0)
            l.add("Fizz");
            else if(i%5==0)
            l.add("Buzz");
            else
            l.add(i+"");
        }
        return l;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int a=ob.nextInt();
        System.out.println(fizzBuzz(a));
        ob.close();
    }
}
