import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class leet442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> li=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int k=nums[i];
            if(map.containsKey(k)){
                int f=map.get(k);
                map.put(k,++f);
            }
            else
            {
                map.put(k,1);
            }
        }
        for(int key:map.keySet())
        {
            if(map.get(key)>1)
            {
                li.add(key);
            }
        }
        return li;
    }
    public static void main(String[] args) {
        
    }
}
