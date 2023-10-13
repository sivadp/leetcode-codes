class Solution {
    public int myAtoi(String s) {
        int index = 0;
        int sign = 1;
        int result = 0;

        // Step 1: Ignore leading whitespaces
        while (index < s.length() && s.charAt(index) == ' ') {
            index++;
        }

        // Step 2: Check for '+' or '-'
        if (index < s.length() && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
            sign = (s.charAt(index) == '-') ? -1 : 1;
            index++;
        }

        // Step 3: Read in digits until a non-digit character is encountered
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            int digit = Character.getNumericValue(s.charAt(index));

            // Step 4: Check for overflow
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            // Append digit to result
            result = result * 10 + digit;
            index++;
        }

        // Apply sign to result
        return result * sign;
    }
}