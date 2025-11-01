import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
            HashSet<Integer> set=new HashSet<>();
            int cnt=0;
            for(int i=0;i<nums.length;i++){
                if(set.contains(nums[i])){
                    cnt=-1;
                    break;
                }
                else{
                    set.add(nums[i]);
                }
            }
            if(cnt==-1){
                return true;
            }
            else{
                return false;
            }
                    
                    
                    
                    
        

        
    }
}