public class Solution {
    public int[] getConcatenation(int[] nums) {
        int inputSize = nums.length;
        int[] ans = new int[inputSize * 2];

        for (int i = 0; i < inputSize; i++) {
            ans[i] = nums[i];
            ans[inputSize + i] = nums[i];
        }

        return ans;
    }
}
