//imp revise
import java.util.*;

public class leet541 {
    public static void reverse(char[] arr,int i,int j)
    {
        while(i<j)
        {
            char t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;j--;
        }
    }
    public static String reverseStr(String s, int k) {
        char[] res=s.toCharArray();
        for(int i=0;i<s.length();i+=(2*k))
        {
            int j=Math.min(i+k-1,s.length()-1);
            reverse(res,i,j);
        }
        return String.valueOf(res);
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s=ob.next();
        int n=ob.nextInt();
        ob.close();
        System.out.println(reverseStr(s,n));
    }
}
