import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> resultSet = new HashSet<>(); 

        Arrays.sort(nums); 
        do {
            List<Integer> numList = new ArrayList<>();
            for (int num : nums) {
                numList.add(num);
            }
            resultSet.add(numList);

        } while (nextPermutation(nums));

        result.addAll(resultSet);
        return result;
    }

    private boolean nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i == -1) {
            return false;
        }

        int j = nums.length - 1;
        while (j > i && nums[j] <= nums[i]) {
            j--;
        }

        swap(nums, i, j);
        reverse(nums, i + 1);
        return true;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start) {
        int end = nums.length - 1;
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
