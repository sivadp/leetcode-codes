class Solution {
    public int findKOr(int[] nums, int k) {
        int[] bitFreq = new int[32];

        // Step 2: Update bit frequencies
        for (int num : nums) {
            for (int i = 0; i < 32; i++) {
                if ((num & (1 << i)) != 0) {
                    bitFreq[i]++;
                }
            }
        }

        int result = 0;

        // Step 3 and 4: Add bits to result
        for (int i = 0; i < 32; i++) {
            if (bitFreq[i] >= k) {
                result |= (1 << i);
            }
        }

        return result;

    }
}