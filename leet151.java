public class leet151 {
    public String reverseWords(String s) {
        String[] arr=s.trim().split("\\s+");
        String a="";
        for(int i=arr.length-1;i>=0;i--)
        {
            if(i==0)
            a+=arr[i];
            else
            a+=arr[i]+" ";
        }
        return a;
    }
    public static void main(String[] args) {
        
    }
}
