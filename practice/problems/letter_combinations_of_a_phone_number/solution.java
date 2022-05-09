 class Solution {
 	private static final String[] vals = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
 	private List<String> result;
 	public List<String> letterCombinations(String digits) {
 		this.result = new ArrayList<>();
 		if(digits.length() == 0) return this.result;
 		dfs(digits, 0, "");
 		return result;
 	}
 	private void dfs(String digits, int cur, String temp){
 		if(cur == digits.length()){
 			result.add(temp);
 		}else{
 			int num = digits.charAt(cur) - '0';
 			for(char c : vals[num].toCharArray()){
 				dfs(digits, cur + 1, temp + c);
 			}
 		}
 	}
 }