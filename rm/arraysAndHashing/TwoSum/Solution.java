package arraysAndHashing.TwoSum;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arrayToCheck = new int[]{15, 11, 7, 2};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arrayToCheck, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] out = new int[2];
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len ; j++) {
                if (nums[i] + nums[j] == target){
                    out[0] = i;
                    out[1] = j;
                }
            }
        }
        return out;
    }
}
