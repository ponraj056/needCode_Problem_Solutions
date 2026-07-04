class Solution {
    public int reverse(int x) {
        int rev=0;
       while(x!=0){
             int digit=x%10;
              x/=10;
              if(rev > 2147483647/10 || (rev == 2147483647/10 && digit > 7)) return 0;
             if(rev < -2147483648/10 || (rev == -2147483648/10 && digit < -8)) return 0;
             rev=rev*10+digit;
            
       }
       return rev;
    }
}