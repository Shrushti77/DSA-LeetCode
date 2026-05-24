class Solution {

    public int[] getConcatenation(int[] nums) {

        // Store size of original array
        int n = nums.length;

        // Create new array of double size
        // because we need two copies of nums
        int[] ans = new int[2 * n];

        // Loop through original array
        for (int i = 0; i < n; i++) {

            // Put element in first half
            ans[i] = nums[i];

            // Put same element in second half
            // i + n shifts position to second half
            ans[i + n] = nums[i];
        }

        // Return final concatenated array
        return ans;
    }
}