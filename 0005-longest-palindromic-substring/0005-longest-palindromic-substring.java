class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        // Preprocess the string to handle even-length palindromes
        StringBuilder modifiedString = new StringBuilder();
        for (char c : s.toCharArray()) {
            modifiedString.append('#').append(c);
        }
        modifiedString.append('#');

        int n = modifiedString.length();
        int[] dp = new int[n];  // Array to store lengths of palindromes at each position
        int center = 0;         // Center of the rightmost palindrome
        int rightBoundary = 0;  // Right boundary of the rightmost palindrome

        int maxLen = 0;
        int maxCenter = 0;

        for (int i = 0; i < n; i++) {
            int mirror = 2 * center - i;  // Mirror position of the current position

            // Check if the current position is within the right boundary
            if (i < rightBoundary) {
                dp[i] = Math.min(rightBoundary - i, dp[mirror]);
            }

            // Attempt to expand palindrome centered at i
            int left = i - (dp[i] + 1);
            int right = i + (dp[i] + 1);

            while (left >= 0 && right < n && modifiedString.charAt(left) == modifiedString.charAt(right)) {
                dp[i]++;
                left--;
                right++;
            }

            // Update center and right boundary if the palindrome centered at i expands beyond it
            if (i + dp[i] > rightBoundary) {
                center = i;
                rightBoundary = i + dp[i];
            }

            // Update the maximum palindrome
            if (dp[i] > maxLen) {
                maxLen = dp[i];
                maxCenter = i;
            }
        }

        // Extract the longest palindrome from the modified string
        int start = (maxCenter - maxLen) / 2;
        int end = start + maxLen;
        return s.substring(start, end);
    }
}
