import java.util.*;
//167

public class leet167 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int a=ob.nextInt();
        int[] n=new int[a];
        for(int i=0;i<a;i++)
        {
            n[i]=ob.nextInt();
        }
        int target=ob.nextInt();
        ob.close();
        int l=0;
        int u=n.length-1;
        int[] arr=new int[2];
        while(l<u)
        {
            if(n[l]+n[u]==target)
            {
                arr[0]=l+1;
                arr[1]=u+1;
                break;
            }
            else if(n[l]+n[u]>target)
            u--;
            else
            l++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
