import java.util.ArrayList;
import java.util.List;

class Solution {
    List<String> result = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        generateParenthesisHelper("", 0, 0, n);
        return result;
    }

    private void generateParenthesisHelper(String current, int open, int close, int n) {
        if (current.length() == n * 2) {
            result.add(current);
            return;
        }

        if (open < n) {
            generateParenthesisHelper(current + "(", open + 1, close, n);
        }

        if (close < open) {
            generateParenthesisHelper(current + ")", open, close + 1, n);
        }
    }
}
