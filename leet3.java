import java.util.Arrays;
import java.util.Scanner;

public class leet3 {
    public static int lengthOfLongestSubstring(String s) {
        int l=s.length();
        int max=0;
        int start=0;
        int[] arr=new int[128];
        Arrays.fill(arr,0);
        for(int i=0;i<l;i++)
        {
            arr[s.charAt(i)]++;
            while(arr[s.charAt(i)]>1&&start<i)
            {
                arr[s.charAt(start)]--;
                start++;
            }
            max=Math.max(max,i-start+1);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s=ob.nextLine();
        System.out.println(lengthOfLongestSubstring(s));
        ob.close();
    }
}
