import java.util.Scanner;

public class leet1859 {
    public static String sortSentence(String s) {
        String[] n=s.split(" ");
        String[] arr=new String[n.length]; 
        for(int i=0;i<n.length;i++)
        {
           int t= n[i].charAt(n[i].length()-1)-'0';
            String temp=n[i].substring(0,n[i].length()-1);
            arr[t-1]=temp;
            t=0;
        }
        String ans="";
        for(int i=0;i<arr.length;i++)
        {
            if(i==arr.length-1)
            ans+=arr[i];
            else
            ans+=arr[i]+" ";
        }
        return ans;    
    }   
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s=ob.nextLine();
        ob.close();
        System.out.println(sortSentence(s));
    }
}
