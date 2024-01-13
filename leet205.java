import java.util.Scanner;

public class leet205 {
    public static boolean isIsomorphic(String s, String t) {
        int[] map1=new int[200];
        int[] map2=new int[200];
        if(s.length()!=t.length())
        return false;

        for(int i=0;i<s.length();i++)
        {
            if(map1[s.charAt(i)]!=map2[t.charAt(i)])
            return false;
            map1[s.charAt(i)]=i+1;
            map2[t.charAt(i)]=i+1;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String a=ob.nextLine();
        String b=ob.nextLine();
        System.out.println(isIsomorphic(a, b));
        ob.close();
    }
}
