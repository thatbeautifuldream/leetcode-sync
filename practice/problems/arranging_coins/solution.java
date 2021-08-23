class Solution {
    public int arrangeCoins(int n) {
        int count = 0, step = 1;
        while(n > 0) {
            if((n - step) >= 0) {
                count++;
                n -= step;
                step++;
            }
            else {
                break;
            }
        }
        return count;
    }
}