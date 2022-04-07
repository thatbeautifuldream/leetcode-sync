class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : stones) {
            q.add(i);
        }
        int x = 0, y = 0;
        while(q.size() > 1) {
            y = q.poll();
            x = q.poll();
            if(y > x) {
                q.offer(y-x);
            }
        }
        return q.isEmpty() ? 0 : q.poll();
    }
}