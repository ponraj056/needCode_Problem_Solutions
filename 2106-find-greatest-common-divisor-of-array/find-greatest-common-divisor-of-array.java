class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int l=nums[0];
        int r=nums[nums.length-1];
        while(l!=0){
            int temp=l;
            l=r%l;
            r=temp;
        }
  return r;
    }
}