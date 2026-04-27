import java.util.*;

class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add all numbers that are NOT equal to val
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                list.add(nums[i]);
            }
        }

        // Put the list back into the nums array
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }

        // Return the new length
        return list.size();
    }
}
