public class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int leftSum = 0;
        int rightSum = 0;
        for (int l = 0, r = nums.length - 1; l < nums.length; l++, r--) {
            left[l] = leftSum;
            leftSum += nums[l];
            right[r] = rightSum;
            rightSum += nums[r];
        }
        for(int i = 0 ; i < nums.length; i ++){
            left[i] = Math.abs(left[i]- right[i]);
        }
        return left;
    }
}
