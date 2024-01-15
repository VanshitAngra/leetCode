import java.util.Scanner;

public class leet2319 {
    public static boolean checkXMatrix(int[][] grid) {
        int l=grid.length;
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
            {
                if(i==j ||j==l-i-1)
                {
                if(grid[i][j]==0||grid[i][j]==0)
                return false;}
                else 
                {if(grid[i][j]!=0)
                return false;}
            }

        }
        return true;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[][] a=new int[n][n];
        for(int i=0;i<n;i++)
        {
            a[i][i]=ob.nextInt();
        }
        System.out.println(checkXMatrix(a));
        ob.close();
    }
}
