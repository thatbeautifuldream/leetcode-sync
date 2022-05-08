public class NestedIterator implements Iterator<Integer> {
    Queue<Integer> queue = new LinkedList<Integer>();
    
    public NestedIterator(List<NestedInteger> nestedList) {
        if (nestedList == null || nestedList.size() == 0) return;
        dfs(nestedList);
    }
    
    private void dfs(List<NestedInteger> list) {
        for (NestedInteger nestedInteger : list) {
            if (nestedInteger.isInteger()) queue.offer(nestedInteger.getInteger());
            dfs(nestedInteger.getList());
        }
    }

    @Override
    public Integer next() {
        return !queue.isEmpty() ? queue.poll(): null;
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();   
    }
}