class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min=Integer.MAX_VALUE;
        int l=0;
        int sum=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            max+=nums[i];
            while(sum >= target){
                min=Math.min(min,i-l+1);
                sum-=nums[l++];
            }
        }
        if(max < target) return 0;
        return min;
    }
}