class Solution {
    public int[] productExceptSelf(int[] nums) {
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                cnt+=1;
            }
        }
        if(cnt>1){
            for(int i=0;i<nums.length;i++){
                nums[i]=0;
            }
            return nums;
        }
        else{
            int prod=1;
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=0){
                    prod *=nums[i];
                }
            }
            if(cnt==1){
                for(int i=0;i<nums.length;i++){
                    if(nums[i]==0){
                        nums[i]=prod;
                    }
                    else{
                        nums[i]=0;
                    }
                }

            }
            else{
                
            for(int i=0;i<nums.length;i++){
                
                    nums[i] =prod/nums[i];
            }
            }
            return nums;
        }
        
    }
}


