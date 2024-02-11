import java.util.*;

public class leet557 {
    public static String reverse(String s)
    {
        char[] c=s.toCharArray();
        int l=0,r=s.length()-1;
        while(l<r)
        {
            char t=c[l];
            c[l]=c[r];
            c[r]=t;
            l++;r--;
        }
        return String.valueOf(c);
    }
    public static String reverseWords(String s) {
        String ans="";
        String[] arr=s.split(" ");

        for(int i=0;i<arr.length;i++)
        {
            if(i==arr.length-1)
            {
                ans+=reverse(arr[i]);
            }
            else
            ans+=reverse(arr[i])+" ";
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s=ob.nextLine();
        System.out.println(reverseWords(s));
        ob.close();
    }
}
