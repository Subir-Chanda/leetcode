class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (high >= low) {
            if (high < 2) {
                return 0;
            }
            int mid = (low + high) / 2;
            if ((arr[mid] > arr[mid + 1]) && (arr[mid] > arr[mid - 1])) {
                return mid;
            } else if ((arr[mid] < arr[mid + 1]) && (arr[mid] > arr[mid - 1])) {
                low = mid;
            } else if ((arr[mid] > arr[mid + 1]) && (arr[mid] < arr[mid - 1])) {
                high = mid;
            }
        }
        return 0;
    }
}