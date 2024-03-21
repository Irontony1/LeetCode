package arraysAndHashing.ContainsDuplicate;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] array = {1,5,-2,-4,0};
        System.out.println(containsDuplicate(array));
    }

    /*public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(Integer num : nums){
            if(set.contains(num)) return true;
            else set.add(num);
        }
        return false;
    }    */
    public static boolean containsDuplicate(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        for (int i = 0, j = i + 1; j < len; i++, j++){
            if(nums[i] == nums[j]) return true;
        }
        return false;
    }
}

