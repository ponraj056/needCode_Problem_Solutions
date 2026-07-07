public class Solution {
    public int LengthOfLastWord(string s) {
        string[] s1=s.Split(' ',StringSplitOptions.RemoveEmptyEntries);
        return s1[s1.Length-1].Length;
    }
}