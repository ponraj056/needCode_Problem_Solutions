class Solution {
    public int strStr(String haystack, String needle) {
        int len = needle.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < haystack.length() - len + 1; i++) {
            sb.setLength(0);
            for (int j = i; j < len + i; j++) {
                sb.append(haystack.charAt(j));
            }
            if (sb.toString().equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}