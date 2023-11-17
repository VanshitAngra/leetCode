import java.util.ArrayList;
import java.util.Scanner;

public class seprate {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] nums=new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=ob.nextInt();
        }
        ob.close();
            ArrayList<Integer> a=new ArrayList<>();
        String s="";
        for(int i=0;i<nums.length;i++)
        {
            s=nums[i]+"";
            if(s.length()>1)
            {
                int t=s.length();
                for(int j=0;j<t;j++)
                {
                    a.add(Integer.parseInt(String.valueOf(s.charAt(j))));
                }
            }
            else
            a.add(nums[i]);
        }
        int[] res=new int[a.size()];
        for(int i=0;i<a.size();i++)
        {
            res[i]=a.get(i);
        }
        System.out.println(String.valueOf(res));
    }
}
