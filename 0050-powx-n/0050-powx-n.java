class Solution {
    public double myPow(double x, int n) {
        long N = n; // Convert n to long to handle Integer.MIN_VALUE case

        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double result = 1.0;
        double currentProduct = x;

        for (long i = N; i > 0; i /= 2) {
            if (i % 2 == 1) {
                result *= currentProduct;
            }
            currentProduct *= currentProduct;
        }

        return result;

    }
}