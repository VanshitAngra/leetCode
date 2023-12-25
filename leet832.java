import java.util.*;
//832
public class leet832 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int m=ob.nextInt();
        int[][] image=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                image[i][j]=ob.nextInt();
            }
        }
        ob.close();
        int[][] res=new int[image.length][image[0].length];
        for(int i=0;i<image.length;i++)
        {
            for(int j=0;j<image[0].length;j++)
            {
                if(image[i][j]==0)
                res[i][image.length-j-1]=1;
                else
                res[i][image.length-j-1]=0;
            }
        }
        System.out.println(String.valueOf(res));
    }
}
