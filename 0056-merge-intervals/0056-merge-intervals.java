import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < intervals.length; i++) {
            if (result.isEmpty() || result.get(result.size() - 1).get(1) < intervals[i][0]) {
                // No overlap, add the interval to the result
                result.add(Arrays.asList(intervals[i][0], intervals[i][1]));
            } else {
                // Overlap, merge the intervals
                List<Integer> current = result.get(result.size() - 1);
                current.set(1, Math.max(current.get(1), intervals[i][1]));
            }
        }

        int[][] finalResult = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            finalResult[i][0] = result.get(i).get(0);
            finalResult[i][1] = result.get(i).get(1);
        }

        return finalResult;
    }
}
