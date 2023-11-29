import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class leet2788 {
    public static List<String> splitWordsBySeparator(List<String> words, char s) {
        List<String> res=new ArrayList<>();
        for(int i=0;i<words.size();i++)
        {
            String[] arr =words.get(i).split("["+s+"]");
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j].length()>0)
                    res.add(arr[j]);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s=ob.nextLine();
        List<String> q=new ArrayList<>();
        q.add(s);
        char c=ob.next().charAt(0);
        splitWordsBySeparator(q, c);
        ob.close();
    }
}
