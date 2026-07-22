public class Solution {
    public bool RotateString(string s, string goal) {
        if(s.Length!=goal.Length){
            return false;
        }
        string temp=s+s;
      return temp.Contains(goal);
    }
}