//**************** */
public class leet34 {
    public int[] searchRange(int[] nums, int target) {
        int[] a={-1,-1};
        int l=0,r=nums.length-1;
        int m=l+(r-l)/2;
        while(l<=r)
        {
            m=l+(r-l)/2;
            if(nums[m]==target)
            {
                a[0]=m;
                r=m-1;
            }
            else if(nums[m]<target)
            l=m+1;
            else
            r=m-1;
        }
        l=0;r=nums.length-1;
        while(l<=r)
        {
            m=l+(r-l)/2;
            if(nums[m]==target)
            {
                a[1]=m;
                l=m+1;
            }
            else if(nums[m]<target)
            l=m+1;
            else
            r=m-1;
        }
        return a;
    }
    public static void main(String[] args) {
        
    }
}
