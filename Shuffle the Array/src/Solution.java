import java.util.Arrays;

public class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] first = Arrays.copyOf(nums, n);
        int[] second = Arrays.copyOfRange(nums, nums.length / 2, nums.length);
        int[] ans = new int[nums.length];
        for (int i = 0, k = 0; i < nums.length; i = i + 2, k++) {
            ans[i] = first[k];
            ans[i + 1] = second[k];
        }

        return ans;
    }
}