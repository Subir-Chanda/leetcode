import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int sum=0;
        int mul=0;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }
            else{
                set.add(nums[i]);
                mul+=2*nums[i];

            }
            sum+=nums[i];
        }
        return mul-sum;
    }
}