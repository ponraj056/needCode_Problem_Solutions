class Solution {
    public int numberOfSubstrings(String s) {
                int start=0;
        int c=0;
        int freq[]=new int[3];
        for(int end=0; end<s.length();end++){
            freq[s.charAt(end)-'a']++;
            while(freq[0]>=1 && freq[1]>=1 && freq[2]>=1){
                c+=s.length()-end;
                freq[s.charAt(start)-'a']--;
                start++;
            }
        }
        return c;
    }
}