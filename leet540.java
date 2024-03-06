public class leet540 {
    public int singleNonDuplicate(int[] nums) {
        int l=0;int r=nums.length-1;
        while(l<r)
        {
            int m=l+(r-l)/2;
            if(m%2==1)
            m--;
            if(nums[m]!=nums[m+1])
            r=m;
            else
            l=m+2;
        }
        return nums[l];
    }
    public static void main(String[] args) {
        
    }
}
