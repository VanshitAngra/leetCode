import java.util.Scanner;

public class leet1523 {
    public static int countOdds(int low, int high) {
        if(low%2==0&&high%2==0)
        return (high-low)/2;
        else if(low%2!=0&&high%2!=0)
        return (high-low)/2+1;
        else
        return (high-low+1)/2;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int l=ob.nextInt();
        int h=ob.nextInt();
        System.out.println(countOdds(l, h));
        ob.close();
    }
}
