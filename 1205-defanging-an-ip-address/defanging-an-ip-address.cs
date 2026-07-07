public class Solution {
    public string DefangIPaddr(string address) {
        string s="";
        for(int i=0;i<address.Length;i++){
            if(address[i]=='.'){
                s+="[.]";
            }
            else{
                s+=address[i];
            }
        }
        return s;
    }
}