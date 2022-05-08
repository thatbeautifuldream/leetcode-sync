public class Solution {
    public boolean find132pattern(int[] nums) {
        if (nums == null || nums.length < 3) return false;
        Deque<Integer> stack = new ArrayDeque<Integer>();
        int len = nums.length;
        int maxSecond = Integer.MIN_VALUE;
        for (int i = len - 1; i >= 0; i--) {
            if(nums[i] < maxSecond) {
                return true;
            } 
            while(!stack.isEmpty() && nums[i] > stack.peek()) {
                maxSecond = stack.pop();
            }
            stack.push(nums[i]);    
        }
        return false;
        
    }
}