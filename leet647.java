import java.util.Scanner;

public class leet647 {
    public static boolean pali(String st)
	{
		for(int i=0;i<st.length()/2;i++)
		{
			if(st.charAt(i)!=st.charAt(st.length()-i-1))
			return false;

		}
		return true;
	}
    public static int countSubstrings(String s) {
        int a=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				String s1=s.substring(i,j);
				if(pali(s1))
				a++;
			}
		}
        return a;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s=ob.nextLine();
        System.out.println(countSubstrings(s));
        ob.close();
    }
}
