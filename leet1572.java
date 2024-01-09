import java.util.Scanner;

public class leet1572 {
    public static int diagonalSum(int[][] mat) {
        int row=mat[0].length;
        int col=mat.length;
        int sum=0;
        for(int i=0;i<row;i++)
        {
            sum+=mat[i][i]+mat[i][col-i-1];
        }
        if(col%2==1)
        {
            sum-=mat[col/2][col/2];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int m=ob.nextInt();
        int[][] nums=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            nums[i][j]=ob.nextInt();
        }
        ob.close();
        System.out.println(diagonalSum(nums));
    }
}
