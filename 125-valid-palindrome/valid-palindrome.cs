public class Solution {
    public bool IsPalindrome(string s) {
        int l=0;
        int r=s.Length-1;
        s=s.ToUpper();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<=r;i++){
            if( char.IsLetterOrDigit(s[i])){
                sb.Append(s[i]);
            }
        }
        string s1=sb.ToString();
        int k=s1.Length-1;
       while(l<k){
         if(s1[l]!=s1[k]) {
            return false;
         }
         l++;
         k--;
         }
       return true;
    }
}