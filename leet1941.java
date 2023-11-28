import java.util.*;
//1941
public class leet1941 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s=ob.next();
        s+="{";
         List<Integer> n=new ArrayList<>();
        char[] c=s.toCharArray();
        Arrays.sort(c);
        int a=0;
        System.out.println(String.valueOf(c));
        ob.close();
        for(int i=0;i<c.length-1;i++)
        {

            if(c[i]==c[i+1])
            {
                a++;
                System.out.println(a);
                continue;
            }
            else
            {
            n.add(a);
            a=0;

            }
        }
        System.out.println(String.valueOf(n));
        for(int i=0;i<n.size()-1;i++)
        {
            if(n.get(i)!=n.get(i+1))
            {
                System.out.println(false);
                return;

            }
        }
        System.out.println(true);
    }
}
