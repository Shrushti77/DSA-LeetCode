class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] < nums[mid + 1]) {
                // Peak lies on the right
                low = mid + 1;
            } else {
                // Peak lies on the left or at mid
                high = mid;
            }
        }
        return low; // or high (both are same)
    }
}
