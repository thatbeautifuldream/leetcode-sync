class Solution {
    public int[] buildArray(int[] nums) {
        int[] res = new int[nums.length];
        int i = nums.length - 1;
        while(i >= 0) {
            res[nums.length - i - 1] = nums[nums[nums.length - i - 1]];
            i--;
        }
        return res;
    }
}