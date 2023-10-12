class Solution {
    public int reverse(int x) {
        try {
            // Convert the absolute value to a StringBuilder and reverse it
            StringBuilder strBuilder = new StringBuilder(Integer.toString(Math.abs(x))).reverse();

            // Parse the reversed string to an integer
            int result = Integer.parseInt(strBuilder.toString());

            // Apply the sign to the result
            return x < 0 ? -result : result;
        } catch (NumberFormatException e) {
            // Handle the case where the reversed string exceeds the integer range
            return 0;
        }
    }
}
