class Solution {
        public static int numJewelsInStones(String jewels, String stones) {
        // Create a HashMap to store the counts of each stone type
        Map<Character, Integer> stoneCounts = new HashMap<>();

        // Count occurrences of each stone type in stones
        for (char stone : stones.toCharArray()) {
            stoneCounts.put(stone, stoneCounts.getOrDefault(stone, 0) + 1);
        }

        // Sum up the counts of stones that are also jewels
        int jewelCount = 0;
        for (char jewel : jewels.toCharArray()) {
            jewelCount += stoneCounts.getOrDefault(jewel, 0);
        }

        return jewelCount;
    }
}