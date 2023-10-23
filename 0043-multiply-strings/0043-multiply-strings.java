class Solution {
    Map<Character, Integer> mapper = new HashMap<>();
    {
        mapper.put('0', 0);
        mapper.put('1', 1);
        mapper.put('2', 2);
        mapper.put('3', 3);
        mapper.put('4', 4);
        mapper.put('5', 5);
        mapper.put('6', 6);
        mapper.put('7', 7);
        mapper.put('8', 8);
        mapper.put('9', 9);
    }
   public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        char[] result = new char[num1.length() + num2.length()];
        for (int i = 0; i < result.length; i++) {
            result[i] = '0';
        }

        for (int i = num1.length() - 1; i >= 0; i--) {
            int carry = 0;
            int digit1 = num1.charAt(i) - '0';

            for (int j = num2.length() - 1; j >= 0; j--) {
                int digit2 = num2.charAt(j) - '0';
                int sum = (result[i + j + 1] - '0') + digit1 * digit2 + carry;
                carry = sum / 10;
                result[i + j + 1] = (char) (sum % 10 + '0');
            }

            result[i] += carry;
        }

        // Convert char array to String
        return trimLeadingZeros(new String(result));
    }
    private String trimLeadingZeros(String num) {
        int nonZeroIndex = 0;
        while (nonZeroIndex < num.length() && num.charAt(nonZeroIndex) == '0') {
            nonZeroIndex++;
        }

        return (nonZeroIndex == num.length()) ? "0" : num.substring(nonZeroIndex);
    }
}