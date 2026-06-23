class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if (n2 < n1)
            return false;
        int freq1[] = new int[128];
        int freq2[] = new int[128];
        for (int i = 0; i < n1; i++) {
            freq1[s1.charAt(i)]++;
            freq2[s2.charAt(i)]++;
        }
        if (Arrays.equals(freq1, freq2))
            return true;
        for (int i = n1; i < n2; i++) {
            freq2[s2.charAt(i)]++;
            freq2[s2.charAt(i - n1)]--;
            if (Arrays.equals(freq1, freq2))
                return true;
        }
        return false;
    }
}