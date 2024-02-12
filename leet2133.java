
import java.util.*;

public class leet2133 {
    public static boolean checkValid(int[][] matrix) {
        int l=matrix.length;
        for(int i=0;i<l;i++) 
        {
            HashSet<Integer> s=new HashSet<>();
            for(int j=0;j<l;j++)
            {
                s.add(matrix[i][j]);
            }
            if(s.size()!=l)
            return false;
        }
        for(int i=0;i<l;i++) 
        {
            HashSet<Integer> s=new HashSet<>();
            for(int j=0;j<l;j++)
            {
                s.add(matrix[j][i]);
            }
            if(s.size()!=l)
            return false;
        }
        return true;
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
        System.out.println(checkValid(nums));
    }
    }
}
