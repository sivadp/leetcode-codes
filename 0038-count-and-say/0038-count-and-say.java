class Solution {
    public String countAndSay(int n) {
        StringBuilder current = new StringBuilder("1");

        for (int i = 1; i < n; i++) {
            int count = 1;
            StringBuilder next = new StringBuilder();

            for (int j = 0; j < current.length(); j++) {
                if (j + 1 < current.length() && current.charAt(j) == current.charAt(j + 1)) {
                    count++;
                } else {
                    next.append(count).append(current.charAt(j));
                    count = 1;
                }
            }

            current = next;
        }

        return current.toString();
    }
}
