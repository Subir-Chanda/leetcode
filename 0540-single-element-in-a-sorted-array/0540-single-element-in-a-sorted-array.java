class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int size = nums.length;
        while (high >= low) {
            if (nums.length == 1) {
                return nums[0];
            }
            int mid = (low + high) / 2;
            if (low == high) {
                return nums[mid];
            }
            if ((nums[mid] != nums[mid + 1]) && (nums[mid] != nums[mid - 1])) {
                return nums[mid];
            } else if (((size - 1) / 2) % 2 == 0) {
                if (nums[mid] == nums[mid + 1]) {
                    low = mid + 2;
                } else {
                    high = mid - 2;
                }
                size = ((size - 1) / 2) - 1;
            } else if (((size - 1) / 2) % 2 != 0) {
                if (nums[mid] == nums[mid + 1]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
                size = ((size - 1) / 2);
            }

        }
        return 0;
        
    }
}