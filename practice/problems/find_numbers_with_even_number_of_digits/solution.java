class Solution {
    public int findNumbers(int[] nums) {
        int even_count = 0;
        for(int num : nums) {
            int num_digit = (int) Math.log10(num) + 1;
            if(num_digit % 2 == 0)
                even_count++;
        }
        return even_count;
    }
}