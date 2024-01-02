import java.util.Scanner;

public class leet1672 {
    public static int maximumWealth(int[][] accounts) {
        int row=accounts.length;
        int col=accounts[0].length;
        int max=-1;
        for(int i=0;i<row;i++)
        {
            int a=0;
            for(int j=0;j<col;j++)
            {
                a+=accounts[i][j];
            }
            max=Math.max(max,a);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int m=ob.nextInt();
        int[][] a=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
            a[i][j]=ob.nextInt();
            }
        }
        ob.close();
        System.out.println(maximumWealth(a));
    }
}
