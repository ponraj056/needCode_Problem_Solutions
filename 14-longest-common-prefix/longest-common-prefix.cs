public class Solution {
    public string LongestCommonPrefix(string[] strs) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<strs[0].Length;i++){
            int freq=0;
            char c=strs[0][i];
            for(int j=0;j<strs.Length;j++){
              if(i<strs[j].Length && strs[j][i]==c){
                freq++;
              }
            }
            if(freq==strs.Length){
                sb.Append(c);
            }
            else{
                break;
            }
        }
        return sb.ToString();
    }
}