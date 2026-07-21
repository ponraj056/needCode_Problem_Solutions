public class Solution {
    public int MaxActiveSectionsAfterTrade(string s) {
        int one=0;
        foreach(char c in s.ToCharArray()){
            if(c=='1'){
                one++;
            }
        }
        string t="1"+s+"1";
        int max=0;
        int pre=0;
        int i=0;
        while(i<t.Length){
            if(t[i]=='0'){
            int sum=0;
             while(i<t.Length && t[i]=='0'){
                sum++;
                i++;
             }
             if(pre>0){
                max=Math.Max(max,pre+sum);
             }
             pre=sum;
           }
           else{
            i++;
           }
        }
        return one+max;
    }
}