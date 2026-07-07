public class Solution {
    public bool IsPalindrome(int x) {
        int n=x;
        int rev=0;
        while(n > 0){
            rev=rev*10+n%10;
            n/=10;
        }
        if(x!=rev) return false;
        return true;
    }
}