import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        // Edge case: if empty or single interval, return as is
        if (intervals.length <= 1) return intervals;

        // Step 1: Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> merged = new ArrayList<>();

        // Initialize with the first interval
        int start = intervals[0][0];
        int end = intervals[0][1];

        // Step 2: Iterate over remaining intervals
        for (int i = 1; i < intervals.length; i++) {
            int currStart = intervals[i][0];
            int currEnd = intervals[i][1];

            if (currStart <= end) {
                // Overlapping intervals → merge
                end = Math.max(end, currEnd);
            } else {
                // No overlap → add previous interval
                merged.add(new int[]{start, end});
                start = currStart;
                end = currEnd;
            }
        }

        // Add the last interval
        merged.add(new int[]{start, end});

        // Convert list to array
        return merged.toArray(new int[merged.size()][]);
    }
}
