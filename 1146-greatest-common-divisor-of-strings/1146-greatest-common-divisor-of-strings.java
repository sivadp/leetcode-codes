class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int length1 = str1.length();
        int length2 = str2.length();
        int bigLen = Math.max(length1, length2);
        int smallLen = Math.min(length1, length2);
        String dividend = "";
        String divisor = "";
        if (bigLen == length1) {
            dividend = new String(str1);
            divisor = new String(str2);
        } else if (bigLen == length2) {
            dividend = new String(str2);
            divisor = new String(str1);
        } else {
            dividend = new String(str1);
            divisor = new String(str2);
        }
        String gcd = greatestCommonDivisor(dividend, divisor);
        if (gcd != null) {
            return gcd;
        }
        return "";
    }

public static String greatestCommonDivisor(String dividend, String divisor) {
    int len1 = divisor.length();
    int len2 = dividend.length();
    for (int i = len1; i >= 1; i--) {
        if (len1 % i == 0 && len2 % i == 0) {
            String newDivisor = dividend.substring(0, i);
            if (dividesAll(newDivisor, dividend) && dividesAll(newDivisor, divisor)) {
                return newDivisor;
            }
        }
    }
    return null;
}

private static boolean dividesAll(String divisor, String dividend) {
    int len1 = divisor.length();
    int len2 = dividend.length();
    for (int i = 0; i < len2; i += len1) {
        String substring = dividend.substring(i, i + len1);
        if (!substring.equals(divisor)) {
            return false;
        }
    }
    return true;
}
}