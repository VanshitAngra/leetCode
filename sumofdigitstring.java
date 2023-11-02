import java.util.Scanner;

public class sumofdigitstring {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s=ob.next();
        int k=ob.nextInt();
        ob.close();
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)-96<9)
            sum+=(int)(s.charAt(i)-96);
            else
            sum+=(s.charAt(i)-96)/10+(s.charAt(i)-96)%10;
        }
        if(k==1)
        {
            System.out.println(sum);
            return;
        }
        while(--k >0)
        {
            int a=sum;
            sum=0;
            while(a>0)
            {
                int r=a%10;
                sum+=r;
                a/=10;
            }            
        }
         System.out.println(sum); 
    }
}
