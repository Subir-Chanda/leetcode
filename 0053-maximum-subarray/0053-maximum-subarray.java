class Solution {
    public int maxSubArray(int[] nums) {
        int currsum=0,maxsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            currsum+=nums[i];
            if(currsum>maxsum){
                maxsum=currsum;
            }
            if(currsum<0){
                currsum=0;
            }
        }
        return maxsum;
    }
    public static void main(String[] args){
        int nums[]={1,2,3,4,5,6,};
        Solution sol=new Solution();
        sol.maxSubArray(nums);
    }
}