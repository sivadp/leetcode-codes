import java.util.HashMap;
import java.util.Map;

class Solution {
    private Map<String, Integer> memo = new HashMap<>();

    public int numTrees(int n) {
        return generateTreeCount(1, n);
    }

    public int generateTreeCount(int start, int end) {
        if (start > end) {
            return 1;  // Empty tree counts as 1 BST
        }

        String key = start + "-" + end;

        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int totalCount = 0;

        for (int i = start; i <= end; i++) {
            int leftCount = generateTreeCount(start, i - 1);
            int rightCount = generateTreeCount(i + 1, end);
            totalCount += leftCount * rightCount;
        }

        memo.put(key, totalCount);
        return totalCount;
    }
}
