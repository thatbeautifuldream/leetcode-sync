class Solution 
{
    public List<List<Integer>> combinationSum3(int k, int n) 
    {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if (k > 9 || n > 45) 
        {
            return result;
        }
        dfs(result, k, n, new LinkedList<Integer>(), 1);
        return result;
    }
    private void dfs(List<List<Integer>> result, int k, int n, List<Integer> curr, int start)
    {
        if (k == 0)
        {
            if (n == 0)
            {
                result.add(new LinkedList<Integer>(curr));
            }
            return;
        }
        for (int i = start; i <= 9; i ++)
        {
            if ((9 - i) < k - 1)
            {
                return;
            }
            curr.add(i);
            dfs(result, k - 1, n - i, curr, i + 1);
            curr.remove(curr.size() - 1);
        }
    }
}