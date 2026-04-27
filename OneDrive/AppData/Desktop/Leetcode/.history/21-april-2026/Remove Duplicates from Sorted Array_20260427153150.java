class Solution {
    public int removeDuplicates(int[] nums) {
        int prev = -101;
        int k = 0;
        for(int i = 0;i<nums.length;i++){
            if(prev!=nums[i]){
                prev = nums[i];
                nums[k++] = prev;
            }
        }
        return k;
    }
}