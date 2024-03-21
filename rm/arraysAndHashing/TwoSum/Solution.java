package arraysAndHashing.TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[] arrayToCheck = new int[]{15, 11, 7, 2};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arrayToCheck, target)));
    }

    /*public static int[] twoSum(int[] nums, int target) {
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
    }    */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            int differenceTarget = target - nums[i];
            if(numsMap.containsKey(differenceTarget)) {
                return new int[]{numsMap.get(differenceTarget),i};
            }
            numsMap.put(nums[i],i);
        }
        return new int[2];
    }
}
