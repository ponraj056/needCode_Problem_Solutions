class Solution {
    public int singleNumber(int[] nums) {
        int sum=0;
        int ones=0,twos=0;
        for(int i:nums){
         ones=(ones^i) & ~twos;
         twos=(twos^i) & ~ones;
        }
        sum=ones+twos;
        return sum;
    }
}