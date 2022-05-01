class Solution {
    public boolean backspaceCompare(String S, String T) {
    int p1 = S.length() - 1;
    int p2 = T.length() - 1;
    while (p1 >= 0 || p2 >= 0) {
        int count = 0;
        while (p1 >= 0 && (S.charAt(p1) == '#' || count > 0)) {
            if (S.charAt(p1) == '#') {
                count++;
            } else {
                count--;
            }
            p1--;
        }
        count = 0;
        while (p2 >= 0 && (T.charAt(p2) == '#' || count > 0)) {
            if (T.charAt(p2) == '#') {
                count++;
            } else {
                count--;
            }
            p2--;
        }
        if (p1 < 0 || p2 < 0) return p1 < 0 && p2 < 0;

        if (S.charAt(p1) != T.charAt(p2)) return false;
        p1--;
        p2--;
    }
    return true;
    }
}