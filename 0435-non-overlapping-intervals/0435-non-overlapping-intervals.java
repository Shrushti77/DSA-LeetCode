import java.util.*;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) return 0;

        // Sort intervals by end time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int removals = 0;
        int lastEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < lastEnd) {
                // Overlapping interval → remove it
                removals++;
            } else {
                // Non-overlapping → keep it
                lastEnd = intervals[i][1];
            }
        }
        return removals;
    }
}
