public class Solution {
    public int strStr(String haystack, String needle) {
        int x = needle.length();
        for (int i = 0; i <= haystack.length() - x; i++) {
            if (haystack.substring(i, i + x).startsWith(needle)) {
                return i;
            }
        }
        return -1;
    }
}