class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] answer = new int[2];
        int start = 0;
        int end = numbers.length-1;
        while(start <= end) {
            int sum = numbers[start] + numbers[end];
            if(sum == target) {
                break;
            }
            else if(sum < target) {
                start++;
            }
            else {
                end--;
            }
        }
        return new int[]{++start,++end};
    }
}