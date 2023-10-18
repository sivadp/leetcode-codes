class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int[] result = {-1, -1};

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                result[0] = mid;
                result[1] = mid;
                // Expand the range to find the leftmost and rightmost occurrences
                while (result[0] > 0 && nums[result[0] - 1] == target) {
                    result[0]--;
                }
                while (result[1] < nums.length - 1 && nums[result[1] + 1] == target) {
                    result[1]++;
                }
                return result;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}
