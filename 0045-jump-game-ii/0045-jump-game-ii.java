class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return 0; // Already at the last index
        }

        int jumps = 0;
        int maxReach = 0;
        int lastJumpEnd = 0;

        for (int i = 0; i < n - 1; i++) {
            maxReach = Math.max(maxReach, i + nums[i]);

            if (i == lastJumpEnd) {
                jumps++;
                lastJumpEnd = maxReach;

                if (lastJumpEnd >= n - 1) {
                    break; // Reached or exceeded the last index
                }
            }
        }

        return jumps;
    }
}
