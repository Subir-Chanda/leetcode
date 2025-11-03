class Solution {
    public void sortColors(int[] nums) {
        int newarr[] = new int[3];
        for (int i = 0; i < nums.length; i++) {
            newarr[nums[i]]++;
        }
        int count = 0;
        int k = 0;
        while (count < newarr[0]) {
            nums[k] = 0;
            count++;
            k++;
        }
        count = 0;
        while (count < newarr[1]) {
            nums[k] = 1;
            count++;
            k++;

        }
        count = 0;
        while (count < newarr[2]) {
            nums[k] = 2;
            count++;
            k++;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        
    }
}