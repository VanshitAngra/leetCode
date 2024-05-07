public class leet162 {
    public int findPeakElement(int[] nums) {
        if(nums.length==1)
        return 0;
        if(nums[nums.length-2]<nums[nums.length-1])
        return nums.length-1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<nums[i-1])
            return i-1;
        }
        return 0;
    }
    public static void main(String[] args) {
        
    }
}
