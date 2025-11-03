class Solution {
    public void sortColors(int[] nums) {
        int newarr[] = new int[3];
        for (int i = 0; i < nums.length; i++) {
            newarr[nums[i]]++;
        }
        int count = 0;
        int k = 0;
        for (int i = 0; i < 3; i++) {

            while (count < newarr[i]) {
                nums[k] = i;
                count++;
                k++;
            }
            count = 0;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
               
        
    }
}