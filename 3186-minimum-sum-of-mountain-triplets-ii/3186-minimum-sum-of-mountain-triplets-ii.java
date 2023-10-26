class Solution {
    public int minimumSum(int[] nums) {
        int N = nums.length;
        int[] sums = new int[N];
        
        int min = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] <= min) {
                min = nums[i];
                
            }
            else {
                sums[i] = nums[i] + min;   
            }
        }
        int res = Integer.MAX_VALUE;
        
        min = nums[N - 1];
        for(int i = N - 2; i >= 0; i--) {
            if(nums[i] <= min) {
                min = nums[i];
            } else {
                if(sums[i] != 0) res = Math.min(res, sums[i] + min);
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}