package me.oktop.leetcode;

public class Solution_944 {
    public int minDeletionSize(String[] strs) {
        if (strs.length == 1) {
            return 0;
        }
        int length = strs[0].length();
        int count = 0;
        for (int i = 0; i < length; i++) {
            char c = strs[0].charAt(i);
            for (int k = 1; k < strs.length; k++) {
                char c1 = strs[k].charAt(i);
                if (c <= c1) {
                    c = c1;
                } else {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
//        int i = new Solution_944().minDeletionSize(new String[]{"abc", "bce", "cae"});
//        int i = new Solution_944().minDeletionSize(new String[]{"cba","daf","ghi"});
//        int i = new Solution_944().minDeletionSize(new String[]{"zyx","wvu","tsr"});
//        int i = new Solution_944().minDeletionSize(new String[]{"cba", "daf", "ghi"});
//        int i = new Solution_944().minDeletionSize(new String[]{"a", "b"});
//        int i = new Solution_944().minDeletionSize(new String[]{"qowfc","spyge","sqbif","vvrkk"});
//        int i = new Solution_944().minDeletionSize(new String[]{"rrjk", "furt", "guzm"});
        int i = new Solution_944().minDeletionSize(new String[]{"x","q"});
        System.out.println(i);
    }
}
