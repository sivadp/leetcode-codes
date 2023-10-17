class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        
        // Step 1: Find the first pair (nums[i], nums[i+1]) such that nums[i] < nums[i+1]
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        
        // Step 2: If no such pair, reverse the entire array and return
        if (i == -1) {
            reverse(nums, 0, n - 1);
            return;
        }
        
        // Step 3: Find the smallest element to the right of nums[i] and greater than nums[i]
        int j = n - 1;
        while (nums[j] <= nums[i]) {
            j--;
        }
        
        // Step 4: Swap nums[i] and nums[j]
        swap(nums, i, j);
        
        // Step 5: Reverse the subarray to the right of nums[i]
        reverse(nums, i + 1, n - 1);
    }
    
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
