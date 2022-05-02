class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while(l < r) {
            while(l < r && nums[l] % 2 == 0) l++;
            while(l < r && nums[r] % 2 == 1) r--;
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
        }
        return nums;
    }
}