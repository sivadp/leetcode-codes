import java.util.Arrays;
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
       int len = flowerbed.length;

        if (n <= 0) {
            return true; // No need to plant more flowers
        }

        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 0) {
                boolean prevEmpty = (i == 0) || (flowerbed[i - 1] == 0);
                boolean nextEmpty = (i == len - 1) || (flowerbed[i + 1] == 0);

                if (prevEmpty && nextEmpty) {
                    flowerbed[i] = 1; // Plant a flower
                    n--; // Decrement the count of flowers to plant
                }
            }
        }

        return n <= 0; // Return true if all flowers are planted
    }
}